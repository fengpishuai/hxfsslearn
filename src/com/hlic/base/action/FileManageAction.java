package com.hlic.base.action;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.activiti.engine.identity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlic.base.process.result.ResultInfo;

import com.hlic.base.service.FileUploadAndDownService;

@Controller
@RequestMapping("fileManage")
public class FileManageAction {

	@Autowired
	private FileUploadAndDownService fileUploadAndDownService;
	
	/**
     * 单个、批量文件上传
     * 
     * @param request
     * @param response
     * @param session
     * @param module
     *            获取传入的模块名称
     * @return
     */
    @RequestMapping(value = "/uploadFiles", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public @ResponseBody ResultInfo uploadFiles(Model model,HttpServletRequest request, HttpSession session) {

        // 获取session中保存的用户信息
        User user = (User) session.getAttribute("user");
        String module = "1";
        // 创建list集合用于获取文件上传返回路径名
        List<String> list = new ArrayList<String>();

        try {
            // 获取上传完文件返回的路径,判断module模块名称是否为空，如果为空则给default作为文件夹名
            list = fileUploadAndDownService.uploadFile(request);
            // model属性也行
            model.addAttribute("fileUrlList", list);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
        ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(0);
		resultInfo.setMessage(list.toString());
		return resultInfo;
    }
    
    @RequestMapping(value = "/download1", method = RequestMethod.GET)
    public ResponseEntity<byte[]> download() throws IOException {
        return fileUploadAndDownService.downFileResponseEntity("CRS157-BX20170328150244782");
    }

	/**
	 * 通过流的方式下载文件
	 * @param url
	 * @param name
	 * @param response
	 */
	@RequestMapping("/download")
	@ResponseBody
	public void download(String url, String name, HttpServletResponse response) {
		HttpURLConnection conn = null;
		try {
			File file = new File(url);
			// 取得文件的后缀名。
			String ext = file.getName().substring(file.getName().lastIndexOf(".") + 1).toLowerCase();
			StringBuffer buffername = new StringBuffer(name);
			String filename = buffername.append(".").append(ext).toString();
 
			URL path = new URL(url);
			conn = (HttpURLConnection) path.openConnection();
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(5 * 1000);
			InputStream fis = conn.getInputStream();// 通过输入流获取数据
 
			byte[] buffer = readInputStream(fis);
			if (null != buffer && buffer.length > 0) {
				// 清空response
				response.reset();
				// 设置response的Header
				response.addHeader("Content-Disposition","attachment;filename="+ new String((filename).getBytes("GBK"),"ISO8859_1"));
				response.addHeader("Content-Length", "" + buffer.length);
				OutputStream toClient = response.getOutputStream();
				response.setContentType("application/octet-stream");
				toClient.write(buffer);
				toClient.flush();
				toClient.close();
			}
 
		} catch (IOException ex) {
			ex.printStackTrace();
		}finally {
			if(conn != null) {
				conn.disconnect();
			}
		}
	}
	/** 
     * 从输入流中获取数据 
     * @param inStream 输入流 
     * @return 
     * @throws Exception 
     */  
	private byte[] readInputStream(InputStream fis) throws IOException {
		 ByteArrayOutputStream outStream = new ByteArrayOutputStream();  
	        byte[] buffer = new byte[1024];  
	        int len = 0;  
	        while( (len=fis.read(buffer)) != -1 ){  
	            outStream.write(buffer, 0, len);  
	        }  
	        fis.close();  
	        return outStream.toByteArray();
	}
}
