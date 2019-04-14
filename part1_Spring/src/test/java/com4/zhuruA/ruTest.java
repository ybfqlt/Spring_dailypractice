package com4.zhuruA;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/ruconcert.xml")
public class ruTest {

    @Autowired
    public Performance performer;

    @Test
    public void testPerform(){
        performer.perform();
    }
}