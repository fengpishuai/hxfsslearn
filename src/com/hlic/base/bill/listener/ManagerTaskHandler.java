package com.hlic.base.bill.listener;



import javax.servlet.http.HttpSession;

import org.activiti.engine.delegate.DelegateTask;
import org.springframework.beans.factory.annotation.Autowired;

import com.hlic.base.pojo.po.Employee;
import com.hlic.base.pojo.vo.FlowVo;
import com.hlic.base.process.utils.ContextHolderUtils;
import com.hlic.base.service.EmployeeService;

public class ManagerTaskHandler{

    @Autowired
    private EmployeeService employeeService;
    
    public void callMethod(DelegateTask delegateTask,String eventName) {
      //从Session中获取当前登录人的信息
        //该employee和hibernate没有一毛钱关系

        HttpSession session = ContextHolderUtils.getSession();
        Employee employee = (Employee) session.getAttribute("user");
        FlowVo flowVo = new FlowVo();
        flowVo.setIsOK(1);
        //HttpServletRequest.getRequest().getSession().getAttribute("user");
        //获取当前登录名
        //int id = employee.getId();
        //使用登录名作为查询条件，查询当前登录名所对应的用户
        //该emp是和hibernate中的session有关联的,是一个持久化对象
        Employee emp = employeeService.findEmployeeById(1);
        //通过查询获取的用户，指定任务的办理人
        delegateTask.setAssignee(emp.getName());

    }

}
