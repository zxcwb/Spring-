package com.zxc.ba03;

import com.zxc.ba02.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/*
@Aspect：是aspectj框架中的注解
作用：表示当前类是切面类
切面类：是用来给业务方法增加功能的类，在这个类中有切面的功能代码
位置：在类定义上面
 */
@Aspect
public class MyAspect {

    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //实现环绕通知
        Object result = null;
        System.out.println("环绕通知：在目标方法之前："+new Date());
        //目标方法调用
        result =  proceedingJoinPoint.proceed();
        //增加功能
        System.out.println("目标方法执行之后，提交事务");
        return result;
    }
}
