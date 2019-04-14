package com4.concert1;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//使用环绕通知重新实现Audience切面

/*@Aspect
public class Audience{
    @Pointcut("execution(* *com4.concert1.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("关闭手机");
            System.out.println("入座");
            jp.proceed();
            System.out.println("好! 鼓掌! 鼓掌! 鼓掌!");
        }catch(Throwable e){
            System.out.println("退票!");
        }
    }
}*/


//通过@Pointcut注解声明频繁使用的切点表达式
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
