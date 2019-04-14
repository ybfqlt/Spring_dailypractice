package com4.xmlconcert;

import com4.concert1.Performance;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class performancexmlMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/point.xml");
        Performance per = (Performance)context.getBean("dancer");
        per.perform();
    }
}
