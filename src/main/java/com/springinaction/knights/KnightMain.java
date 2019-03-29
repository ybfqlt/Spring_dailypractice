package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args)throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/knights.xml");
        Knight knight = context.getBean(Knight.class);   //获取knight bean
        knight.embarkOnQuest();  //使用knight
        context.close();
    }
}