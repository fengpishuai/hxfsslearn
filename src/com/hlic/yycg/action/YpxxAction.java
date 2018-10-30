package com.hlic.yycg.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.hlic.base.pojo.vo.ResultVo;
import com.hlic.base.process.context.Config;
import com.hlic.base.process.result.DataGridResultInfo;
import com.hlic.base.process.result.ResultUtil;
import com.hlic.base.process.result.SubmitResultInfo;
import com.hlic.utils.ExcelExportSXXSSF;
import com.hlic.utils.HxlsOptRowsInterface;
import com.hlic.utils.HxlsRead;
import com.hlic.utils.UUIDBuild;
import com.hlic.yycg.pojo.po.HxQuertionMx;
import com.hlic.yycg.pojo.po.HxQuestion;
import com.hlic.yycg.pojo.po.YpxxCustom;
import com.hlic.yycg.pojo.vo.YPxxQueryVo;
import com.hlic.yycg.service.YpxxService;

@Controller
@RequestMapping("/ypml")
public class YpxxAction {

    @Autowired
    private YpxxService ypxxService;
    
    @Autowired
    private HxlsOptRowsInterface ypxxImportService;

    // 导出页面展示
    @RequestMapping("/exportYpxx")
    public String exportYpxx(Model model) throws Exception {
        return "/business/ypml/exportYpxx";
    }
    
    @RequestMapping("/ask")
    public String ask(Model model) throws Exception {
        return "/project/knowledge/ask";
    }
    
    @RequestMapping("/question")
    public String question(Model model) throws Exception {
        return "/project/knowledge/question";
    }

    // 导出提交
    @RequestMapping("/exportYpxxSubmit")
    public @ResponseBody
    SubmitResultInfo exportYpxxSubmit(YPxxQueryVo ypxxQueryVo) throws Exception {

        // 调用封装类执行导出

        // 导出文件存放的路径，并且是虚拟目录指向的路径
        String filePath = "d:/upload/linshi/";
        //改为从系统参数配置表获取参数值 
        //String filePath = systemConfigService.findBasicinfoById("00301").getValue();
        // 导出文件的前缀
        String filePrefix = "ypxx";
        // -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
        int flushRows = 100;

        // 定义导出数据的title
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("流水号");
        fieldNames.add("通用名");
        fieldNames.add("剂型");
        fieldNames.add("规格");
        fieldNames.add("转换系数");
        fieldNames.add("生产企业");
        fieldNames.add("商品名称");
        fieldNames.add("中标价格");
        fieldNames.add("交易状态");

        // 告诉导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
        List<String> fieldCodes = new ArrayList<String>();
        fieldCodes.add("bm");// 药品流水号
        fieldCodes.add("mc");// 通用名
        fieldCodes.add("jx");
        fieldCodes.add("gg");
        fieldCodes.add("zhxs");
        fieldCodes.add("scqymc");
        fieldCodes.add("spmc");
        fieldCodes.add("zbjg");
        fieldCodes.add("jyztmc");

        // 上边的代码可以优化为，将title和title对应的 pojo的属性，使用map存储
        // ....

        // 注意：fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应，这样title和内容才一一对应

        // 开始导出，执行一些workbook及sheet等对象的初始创建
        ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath,
                "/upload/", filePrefix, fieldNames, fieldCodes, flushRows);

        // 导出的数据通过service取出
        List<YpxxCustom> list = ypxxService.findYpxxList(ypxxQueryVo);

        // 执行导出
        excelExportSXXSSF.writeDatasByObject(list);
        // 输出文件，返回下载文件的http地址，已经包括虚拟目录
        String webpath = excelExportSXXSSF.exportFile();

        System.out.println(webpath);

        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
                Config.MESSAGE, 313, new Object[] {
                        list.size(),
                        webpath//下载地址
                }));
    }
    
  //药品导入页面
    @RequestMapping("/importypxx")
    public String importypxx(Model model)throws Exception{
        
        return "/project/importypxxexcel";
    }
    
    
    //药品导入提交
    @RequestMapping("/importypxxsubmit")
    public @ResponseBody SubmitResultInfo importypxxsubmit(
            //写上传的文件
            MultipartFile ypxximportfile
            )throws Exception{
        
        //将上传的文件写到磁盘
        String originalFilename  = ypxximportfile.getOriginalFilename();
        //写入磁盘的文件
        File file = new File("D:/upload/linshi/"+UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf(".")));
        if(!file.exists()){
            //如果文件目录 不存在则创建
            file.mkdirs();
        }
        
        //将内存中的文件写磁盘
        ypxximportfile.transferTo(file);
        //上传文件磁盘上路径 
        String absolutePath = file.getAbsolutePath();
        
        
        //调用工具类进行药品目录 导入
        HxlsRead xls2csv = null;
        try {
            //第一个参数就是导入的文件
            //第二个参数就是导入文件中哪个sheet
            //第三个参数导入接口的实现类对象
            xls2csv = new HxlsRead(absolutePath,0,ypxxImportService);
            xls2csv.process();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        //提示导入成功条数
        long success_num = xls2csv.getOptRows_success();
        //导入失败数量
        long failure_num = xls2csv.getOptRows_failure();
        
        //对导入失败记录处理
        //获取导入失败记录
        xls2csv.getFailrows();
        //获取导入记录的title
        List rowtitle = xls2csv.getRowtitle();
        rowtitle.add("失败原因");
        //获取导入失败原因
        xls2csv.getFailmsgs();
        
        //将上边获取到的失败记录、title、失败原因，导出成一个 excel
        //使用工具类进行导出，得到导出文件下载路径
        // 开始导出，执行一些workbook及sheet等对象的初始创建
        // 导出文件存放的路径，并且是虚拟目录指向的路径
        String filePath = "d:/upload/linshi/";
        //改为从系统参数配置表获取参数值 
        //String filePath = systemConfigService.findBasicinfoById("00301").getValue();
        // 导出文件的前缀
        String filePrefix = "ypxx";
        // -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
        int flushRows = 100;
        
        ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath,
                "/upload/", filePrefix, xls2csv.getRowtitle(), null, flushRows);
        // 执行导出
        for (int i=0;i<xls2csv.getFailrows().size();i++) {
            List<String> failRow = xls2csv.getFailrows().get(i);
            failRow.add(xls2csv.getFailmsgs().get(i));
            excelExportSXXSSF.writeDatasByString(failRow);
        }
        String webpath = excelExportSXXSSF.exportFile();
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 314, new Object[]{
                success_num,failure_num
        }));
    }
    /**
     * @Title: insertQuestion 
     * @Description: 插入提问的问题
     * @param @param httpSession
     * @param @param inputJson
     * @param @return
     * @param @throws Exception    设定文件 
     * @return ResultVo    返回类型 
     * @throws 
     *
     */
    @RequestMapping("/insertQuestion")
    public @ResponseBody ResultVo insertQuestion(HttpSession httpSession, @RequestBody String inputJson) throws Exception{
    	String userId = (String) httpSession.getAttribute("userId");
    	int code = ypxxService.insertQuestion(inputJson, userId);
    	ResultVo resultVo = new ResultVo();
    	resultVo.setF_CODE(code);
    	return resultVo;
    }
    /**
     * @Title: insertQuestionMx 
     * @Description: 插入回答的问题
     * @param @param httpSession
     * @param @param inputJson
     * @param @return
     * @param @throws Exception    设定文件 
     * @return ResultVo    返回类型 
     * @throws 
     *
     */
    @RequestMapping("/insertQuestionMx")
    public @ResponseBody ResultVo insertQuestionMx(HttpSession httpSession, @RequestBody String inputJson) throws Exception{
    	String userId = (String) httpSession.getAttribute("userId");
    	int code = ypxxService.insertQuestionMx(inputJson, userId);
    	ResultVo resultVo = new ResultVo();
    	resultVo.setF_CODE(code);
    	return resultVo;
    }
    
    @RequestMapping("/queryHxQuestion")
    public @ResponseBody List<HxQuestion> queryHxQuestion(@RequestBody String inputJson) throws Exception{
    	return ypxxService.queryHxQuestionList(inputJson);
    }
    
    @RequestMapping("/queryHxQuestionMxList")
    public @ResponseBody List<Map<String,Object>> queryHxQuestionMxList(@RequestBody String inputJson) throws Exception{
    	List<HxQuertionMx> hxQuertionMxList = ypxxService.queryHxQuestionMxList(inputJson);
    	List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
    	for(HxQuertionMx hxQuertionMx : hxQuertionMxList){
    		Map<String,Object> map = new HashMap<String, Object>();
    		map.put("fPkey", hxQuertionMx.getfPkey());
    		map.put("fSsdjbh", hxQuertionMx.getfSsdjbh());
    		map.put("fHdr", hxQuertionMx.getfHdr());
    		map.put("fHdsj", hxQuertionMx.getfHdsj());
    		map.put("fDisable", hxQuertionMx.getfDisable());
    		map.put("fHdnr", new String(hxQuertionMx.getfHdnr()));
    		list.add(map);
    	}
    	return list;
    }
    @RequestMapping("/queryHxQuertionMxPkey")
    public @ResponseBody List<Map<String,Object>> queryHxQuertionMxPkey(@RequestBody String inputJson) throws Exception{
    	List<HxQuertionMx> hxQuertionMxList = ypxxService.queryHxQuertionMxPkey(inputJson);
    	List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
    	for(HxQuertionMx hxQuertionMx : hxQuertionMxList){
    		Map<String,Object> map = new HashMap<String, Object>();
    		map.put("fPkey", hxQuertionMx.getfPkey());
    		map.put("fSsdjbh", hxQuertionMx.getfSsdjbh());
    		map.put("fHdr", hxQuertionMx.getfHdr());
    		map.put("fHdsj", hxQuertionMx.getfHdsj());
    		map.put("fDisable", hxQuertionMx.getfDisable());
    		map.put("fHdnr", new String(hxQuertionMx.getfHdnr()));
    		list.add(map);
    	}
    	return list;
    }
    @RequestMapping("/updateHxQuestionMx")
    public @ResponseBody ResultVo updateHxQuestionMx(HttpSession httpSession, @RequestBody String inputJson) throws Exception{
    	String userId = (String) httpSession.getAttribute("userId");
    	int code = ypxxService.updateHxQuestionMx(inputJson, userId);
    	ResultVo resultVo = new ResultVo();
    	resultVo.setF_CODE(code);
    	return resultVo;
    }
    /**
     * @Title: queryHotHxQuestionList 
     * @Description: 查询热点问题
     * @param @param httpSession
     * @param @param inputJson
     * @param @return
     * @param @throws Exception    设定文件 
     * @return ResultVo    返回类型 
     * @throws 
     *
     */
    @RequestMapping("/queryHotHxQuestionList")
    public @ResponseBody DataGridResultInfo queryHotHxQuestionList(@RequestBody String inputJson) throws Exception{
    	PageInfo<Map<String,Object>> baseCommonGridList = ypxxService.queryHotHxQuestionList(inputJson);
        // baseCommonGridService.queryCommTableList();
  		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(baseCommonGridList.getPages());
        //填充  rows
        dataGridResultInfo.setRows(baseCommonGridList.getList());
        //当前页
        dataGridResultInfo.setPage(1);
        //总记录数
        dataGridResultInfo.setRecords(baseCommonGridList.getTotal());
        return dataGridResultInfo;
    }
}
