package com4.concert2;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConcertConfig.class)
public class SingerTest {
    @Autowired
    Performance per;

    @Test
    public void Testsinger(){
        per.perform();
        ((Singer)per).sing();
    }
}
