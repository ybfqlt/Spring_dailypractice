package com4.xmlaroundconcert;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("请关闭手机!");
            System.out.println("入座");
            jp.proceed();
            System.out.println("鼓掌! 鼓掌! 鼓掌!");
        }catch(Throwable e){
            System.out.println("退票!");
        }
    }
}
