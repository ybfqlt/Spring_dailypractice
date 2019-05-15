package com.learn.ssm.chapter5.pojo;

/**
 * @Classname Task
 * @Description 任务
 * @Date 19-5-15 下午9:55
 * @Created by ltt
 */
public class Task {
    private Long id;
    private String title;
    private String context;
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
