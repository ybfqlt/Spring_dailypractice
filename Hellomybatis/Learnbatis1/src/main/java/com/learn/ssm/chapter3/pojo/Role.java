package com.learn.ssm.chapter3.pojo;

/**
 * @Author: ltt
 * @Date: 19-5-9 下午3:45
 * @since: JDK 1.8
 */
public class Role {
    private Long id;
    private String roleName;
    private String note;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
