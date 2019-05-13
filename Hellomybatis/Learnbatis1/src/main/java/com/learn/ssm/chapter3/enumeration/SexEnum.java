package com.learn.ssm.chapter3.enumeration;

/**
 * @Author: ltt
 * @Date: 19-5-11 下午11:46
 * @since: JDK 1.8
 */
public enum SexEnum {
    MALE(1,"男"),
        FEMALE(0,"女");

    private int id;
    private String name;
    SexEnum(int id, String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static SexEnum getSexById(int id){
        for(SexEnum sex : SexEnum.values()) {
            if (sex.getId() == id) {
                return sex;
            }
        }
        return null;
    }
}
