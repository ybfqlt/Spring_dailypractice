package com4.concert1;


import org.aspectj.lang.annotation.*;


@Aspect
public class Audience{
    @Pointcut("execution(* *com4.concert1.Performance.perform(..))")
    public void performance(){}//Point签名

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("关掉手机");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("入座");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("好! 鼓掌!　鼓掌!　鼓掌!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("要求退票!");
    }
}



/*
@Aspect
public class Audience {
    @Before("execution(* com4.concert1.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("关掉手机");
    }
    @Before("execution(* com4.concert1.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("入座");
    }
    @AfterReturning("execution(* com4.concert1.Performance.perform(..))")
    public void applause(){
        System.out.println("好! 鼓掌!　鼓掌!　鼓掌!");
    }
    @AfterThrowing("execution(* com4.concert1.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("要求退票!");
    }
}
*/
