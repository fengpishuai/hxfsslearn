package com.hlic.base.service;

import com.hlic.base.pojo.po.Employee;

public interface EmployeeService {

    Employee findEmployeeByName(String name);
    Employee findEmployeeById(Integer id);
}
