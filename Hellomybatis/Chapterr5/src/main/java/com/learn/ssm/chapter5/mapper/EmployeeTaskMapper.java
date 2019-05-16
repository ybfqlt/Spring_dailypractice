package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.EmployeeTask;

/**
 * @Classname EmployeeTaskMapper
 * @Description TODO
 * @Date 19-5-16 下午11:00
 * @Created by ltt
 */
public interface EmployeeTaskMapper {
    public EmployeeTask getEmployeeTaskByEmpId(Long empId);
}
