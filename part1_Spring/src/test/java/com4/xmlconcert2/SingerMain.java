package com4.xmlconcert2;

import com4.concert2.Performance;
import com4.concert2.Singer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/xxconcert2xml.xml");
        Performance per = (Performance)context.getBean("dancer");
        per.perform();
        ((Singer)per).sing();
    }
}
