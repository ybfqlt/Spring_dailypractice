package com.com.learn.ssm.chapter5.pojo;

/**
 * @Classname Role
 * @Description TODO
 * @Date 19-5-13 下午9:06
 * @Created by ltt
 */
public class Role {
    private Long id;
    private String roleName;
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
