package com.learn.ssm.chapter5.pojo;

/**
 * @Classname EmployeeTask
 * @Description 雇员任务
 * @Date 19-5-15 下午10:00
 * @Created by ltt
 */
public class EmployeeTask {
    private Long id;
    private Long empId;
    private Task task = null;
    private String taskName;
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
