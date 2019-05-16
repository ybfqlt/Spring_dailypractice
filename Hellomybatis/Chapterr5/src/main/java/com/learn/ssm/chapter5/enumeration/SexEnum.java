package com.learn.ssm.chapter5.enumeration;

/**
 * @Classname SexEnum
 * @Description TODO
 * @Date 19-5-16 下午1:06
 * @Created by ltt
 */
public enum SexEnum {
    MALE(1,"男"),
       FEMAL(0,"女");

    private int id;
    private String name;
    SexEnum(int id,String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static SexEnum getSexById(int id){
        for(SexEnum sex:SexEnum.values()){
            if(sex.getId() == id){
                return sex;
            }
        }
        return null;
    }
}
