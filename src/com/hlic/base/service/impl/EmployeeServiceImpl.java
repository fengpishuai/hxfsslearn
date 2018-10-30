package com.hlic.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hlic.base.dao.mapper.EmployeeMapper;
import com.hlic.base.pojo.po.Employee;
import com.hlic.base.pojo.po.EmployeeExample;
import com.hlic.base.pojo.po.EmployeeExample.Criteria;
import com.hlic.base.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    
    public Employee findEmployeeByName(String name) {
        EmployeeExample employeeExample = new EmployeeExample();
        Criteria criteria =employeeExample.createCriteria();
        criteria.andNameEqualTo(name);
        return (Employee) this.employeeMapper.selectByExample(employeeExample);
    }

    public Employee findEmployeeById(Integer id) {
        return this.employeeMapper.selectByPrimaryKey(id);
    }

}
