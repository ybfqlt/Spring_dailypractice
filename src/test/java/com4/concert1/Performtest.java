package com4.concert1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ConcertConfig.class)
public class Performtest {

    @Autowired
    private Performance per;

    @Test
    public void testperformance() {
        per.perform();
    }
}
