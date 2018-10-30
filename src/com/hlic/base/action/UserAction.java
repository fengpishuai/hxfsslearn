package com.hlic.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlic.base.pojo.po.SysUser;
import com.hlic.base.pojo.vo.SysuserCustom;
import com.hlic.base.pojo.vo.SysuserQueryVo;
import com.hlic.base.process.context.Config;
import com.hlic.base.process.result.DataGridResultInfo;
import com.hlic.base.process.result.ResultInfo;
import com.hlic.base.process.result.ResultUtil;
import com.hlic.base.process.result.SubmitResultInfo;
import com.hlic.base.service.UserService;
import com.hlic.utils.paginator.domain.PageList;

@Controller
@RequestMapping("user")
public class UserAction {

    @Autowired
    private UserService userService;
    
    //用户查询页面
    @RequestMapping(value="/queryuser")
    public String queryuser(Model model)throws Exception{
        //将页面所需要的数据取出，传到页面
        return "/project/queryuser";
    }
    //用户帮助页面
    @RequestMapping(value="/queryuserhelp")
    public String queryUserHelp(Model model)throws Exception{
        //将页面所需要的数据取出，传到页面
        return "/project/help/syshelp/queryuserhelp";
    }
    
    //用户查询页面的结果集
    //最终DataGridResultInfo通过@ResponseBody将java对象转成json
    @RequestMapping("/queryuser_result")
    public @ResponseBody DataGridResultInfo queryuser_result(
            SysuserQueryVo sysuserQueryVo,
            int page,//页码
            int rows//每页显示个数
            )throws Exception{
        
        //非空校验
        sysuserQueryVo = sysuserQueryVo!=null?sysuserQueryVo:new SysuserQueryVo();
        
        PageList<SysUser> list = userService.getAll(page, rows);
        //list.getPaginator()
        //查询列表的总数
        //int records = userService.findSysuserCount(sysuserQueryVo);
        
        /*PageQuery pageQuery = new PageQuery();
        pageQuery.setPageParams(records, rows, page);
        
        sysuserQueryVo.setPageQuery(pageQuery);
        
        //分页查询，向sysuserQueryVo中传入pageQuery
        List<Sysuser> list = userService.getAll(page, rows);*/
        
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(list.getPaginator().getTotalPages());
        //填充  rows
        dataGridResultInfo.setRows(list);
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(list.getPaginator().getTotalCount());
        return dataGridResultInfo;
    }
    
    //添加用户页面
    @RequestMapping("/addsysuser")
    public String addsysuser(Model model)throws Exception{
        return "/base/user/addsysuser";
    }
    
    //添加用户提交
    //提交 结果转json输出到页面
    //提交表单数据统一使用包装类
    @RequestMapping("/addsysusersubmit")
    public @ResponseBody SubmitResultInfo addsysusersubmit(SysuserQueryVo sysuserQueryVo)throws Exception{
        
        //提示用户信息
        
//      String message = "操作成功！！";
//      int type=0;//成功
        //默认为成功
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
        resultInfo.setMessage("操作成功！");
        
        /*try {
            //调用service执行用户添加
            userService.insertSysuser(sysuserQueryVo.getSysuserCustom());
        } catch (Exception e) {
            //输出异常信息
            e.printStackTrace();
            //对应异常信息进行解析
//          message = e.getMessage();
//          type=1;//失败
            //解析系统自定义异常
            if(e instanceof ExceptionResultInfo){
                //抛出的是系统自定义异常
                resultInfo = ((ExceptionResultInfo)e).getResultInfo();
            }else{
                //重新构造“未知错误”异常
                resultInfo = new ResultInfo();
                resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL);
                resultInfo.setMessage("未知错误！");
            }
        }*/
        
        //使用全局异常处理器后，在actoin不用进行try/catch捕获
        //userService.insertSysuser(sysuserQueryVo.getSysuserCustom());
        
        //将执行结果返回页面
        
//      Map<String, Object> result_map = new HashMap<String, Object>();
//      result_map.put("type", type);
//      result_map.put("message", message);
        
        SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
        
        return submitResultInfo;
    }
    @RequestMapping("/queryuserbz")
    public String queryUserBz(Model model) throws Exception{
        return "/project/bz/queryuserbz";
    }
    @RequestMapping(value="/submitqueryuser",method=RequestMethod.POST)
    public @ResponseBody SubmitResultInfo submitQueryUser(SysuserCustom editData) throws Exception{
        //userService.updateSysuser(editData);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }
  
}
