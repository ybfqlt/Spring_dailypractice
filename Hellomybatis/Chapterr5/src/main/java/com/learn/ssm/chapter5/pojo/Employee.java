package com.learn.ssm.chapter5.pojo;

import com.learn.ssm.chapter5.enumeration.SexEnum;

import java.util.Date;
import java.util.List;

/**
 * @Classname Employee
 * @Description TODO
 * @Date 19-5-16 下午1:02
 * @Created by ltt
 */
public class Employee {
    private Long id;
    private String realName;
    private SexEnum sex = null;
    private String mobile;
    private String email;
    private String position;
    private String note;
    private String birthday;
    private WorkCard workCard;
    private List<EmployeeTask> employeeTaskList = null;

    public List<EmployeeTask> getEmplyeeTaskList() {
        return employeeTaskList;
    }

    public void setEmplyeeTaskList(List<EmployeeTask> emplyeeTaskList) {
        this.employeeTaskList = emplyeeTaskList;
    }

    public WorkCard getWorkCard() {
        return workCard;
    }

    public void setWorkCard(WorkCard workCard) {
        this.workCard = workCard;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
