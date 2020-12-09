package com.zxc.ba08;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
@Aspect：是aspectj框架中的注解
作用：表示当前类是切面类
切面类：是用来给业务方法增加功能的类，在这个类中有切面的功能代码
位置：在类定义上面
 */
@Aspect
public class MyAspect {

    @After(value = "mypt()")
    public void myAfter() throws Throwable {
        System.out.println("执行最终通知，总是会被执行的代码！");
    }

    @Before(value = "mypt()")
    public void myBefore() throws Throwable {
        System.out.println("执行前置通知，目标方法之前执行！");
    }

    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void mypt(){

    }
}
