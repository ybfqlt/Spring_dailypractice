package com4.concert2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class SingerIntroducer {
    //@DeclareParents胡姐所标注的金泰属性指明了要引入的接口
    @DeclareParents(value="com4.concert2.Performance+",defaultImpl = BackSinger.class)
    public static Singer singer;
}
