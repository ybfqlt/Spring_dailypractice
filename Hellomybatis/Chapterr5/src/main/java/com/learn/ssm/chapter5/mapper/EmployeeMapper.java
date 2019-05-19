package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.Employee;

/**
 * @Classname EmployeeMapper
 * @Description TODO
 * @Date 19-5-19 上午10:00
 * @Created by ltt
 */
public interface EmployeeMapper {
    public Employee getEmployee(long id);
}
