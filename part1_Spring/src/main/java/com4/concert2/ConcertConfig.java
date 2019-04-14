package com4.concert2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy  //启用自动代理功能
@ComponentScan
public class ConcertConfig {
    @Bean
    public Performance dance(){
        return new Dancer();
    }
    @Bean
    SingerIntroducer singerIntroducer(){
        return new SingerIntroducer();
    }
}
