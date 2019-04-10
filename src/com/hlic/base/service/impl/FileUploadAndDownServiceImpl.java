package com.hlic.base.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.hlic.base.dao.ScAttachMapper;
import com.hlic.base.pojo.po.ScAttach;
import com.hlic.base.pojo.po.ScAttachExample;
import com.hlic.base.pojo.po.ScAttachExample.Criteria;
import com.hlic.base.service.FileUploadAndDownService;
import com.hlic.utils.PropertyUtil;

public class FileUploadAndDownServiceImpl implements FileUploadAndDownService {
	// 使用日志工厂获取日志对象
    private static Log log = LogFactory.getLog(FileUploadAndDownServiceImpl.class);
    
    @Autowired
    private ScAttachMapper scAttachMapper;
    
	@Override
	public List<String> uploadFile(HttpServletRequest request)
			throws FileNotFoundException {

		// 创建list集合，用于接收上传文件的路径
        List<String> filePathList = new ArrayList<String>();
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        // 拼接文件上传位置，这里使用Tomcat服务器，将文件上传到webapps中，和项目同目录，files将用于保存上传的文件，将上传的文件于项目分开
        StringBuffer strPath = new StringBuffer();
        strPath.append(",files,");
        strPath.append(year);
        strPath.append(",");
        strPath.append(month);
        strPath.append(",");
        strPath.append(day);
        /*String strPath = ",files," + year + "," + month + ","+day;*/

        // 解析出文件存放路径位置
        String filepath = PropertyUtil.getProperty("uploadFilePath")+ strPath.toString().replace(',', File.separatorChar);

        log.debug("文件上传路径位置-------->>>>>>>>>>>>" + filepath);

        // 转换request，解析出request中的文件
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

        // 获取文件map集合
        Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();

        String fileName = null;

        // 循环遍历，取出单个文件
        for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {

            // 获取单个文件
            MultipartFile mf = entity.getValue();

            // 获得原始文件名
            fileName = mf.getOriginalFilename();

            // 截取文件类型; 这里可以根据文件类型进行判断
            String fileType = fileName.substring(fileName.lastIndexOf('.'));

            try {
                // 截取上传的文件名称
                String newFileName = fileName.substring(0, fileName.lastIndexOf('.'));

                log.debug("上传来的文件名称------->>>>>>>>>" + newFileName);

                // 拼接上传文件位置
                String newfilePath = filepath + File.separatorChar + newFileName + fileType;

                log.debug("拼接好的文件路径地址------------->>>>>>>>" + newfilePath);

                // 重新组装文件路径，用于保存在list集合中
                StringBuffer filepathUrl = new StringBuffer();
                filepathUrl.append("files");
                filepathUrl.append(File.separatorChar);
                filepathUrl.append(year);
                filepathUrl.append(File.separatorChar);
                filepathUrl.append(month);
                filepathUrl.append(File.separatorChar);
                filepathUrl.append(day);
                filepathUrl.append(File.separatorChar);
                filepathUrl.append(newFileName);
                filepathUrl.append(fileType);
               /* String filepathUrl = "files" + File.separatorChar + year + File.separatorChar + month
                        + File.separatorChar +day+File.separatorChar+ newFileName + fileType;*/

                log.debug("文件位置---------------->>>>>>>>>>" + filepathUrl.toString());

                // 创建文件存放路径实例
                File dest = new File(filepath.toString());

                // 判断文件夹不存在就创建
                if (!dest.exists()) {
                    dest.mkdirs();
                }

                // 创建文件实例
                File uploadFile = new File(newfilePath);

                // 判断文件已经存在，则删除该文件
                if (uploadFile.exists()) {
                    uploadFile.delete();
                }

                log.debug("start upload file-------------->>>>>>> " + fileName);

                // 利于spring中的FileCopyUtils.copy()将文件复制
                FileCopyUtils.copy(mf.getBytes(), uploadFile);

                // 将文件路径存入list集合中
                filePathList.add(filepathUrl.toString());

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

                log.error("upload failed. filename: " + fileName+"---->>>error message ----->>>>> "+ e.getMessage());

                return null;
            }
        }

        return filePathList;
	}
	
	public ResponseEntity<byte[]> downFileResponseEntity(String fBillId) throws IOException{
    	ScAttachExample scAttachExample = new ScAttachExample();
    	Criteria criteria = scAttachExample.createCriteria();
    	criteria.andFBillIdEqualTo(fBillId);
    	List<ScAttach> scAttach = scAttachMapper.selectByExample(scAttachExample);
    	
    	String filepath = PropertyUtil.getProperty("uploadFilePath") + scAttach.get(0).getfAttStoKey().replace('/', File.separatorChar);
    	File file = new File(filepath);
        HttpHeaders headers = new HttpHeaders();
        //设置文件类型
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        //设置Http状态码
        HttpStatus statusCode = HttpStatus.OK;
        //返回数据
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, statusCode);
    }

}
