package com.learn.ssm.chapter5.pojo;

/**
 * @Classname MaleHealthForm
 * @Description 男性体检表
 * @Date 19-5-15 下午9:50
 * @Created by ltt
 */
public class MaleHealthForm extends HealthForm {
    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }
}
