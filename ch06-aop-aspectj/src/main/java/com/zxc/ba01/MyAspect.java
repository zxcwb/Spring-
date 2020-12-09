package com.zxc.ba01;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import java.util.Date;
/*
@Aspect：是aspectj框架中的注解
作用：表示当前类是切面类
切面类：是用来给业务方法增加功能的类，在这个类中有切面的功能代码
位置：在类定义上面
 */
@Aspect
public class MyAspect {
   /* @Before(value = "execution(public void com.zxc.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        System.out.println("前置通知，切面功能：在目标方法执行之前输出执行时间："+ new Date());
    }*/

   /* @Before(value = "execution(public void *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        System.out.println("1===前置通知，切面功能：在目标方法执行之前输出执行时间："+ new Date());
    }*/

  /*  @Before(value = "execution(* *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        System.out.println("2==前置通知，切面功能：在目标方法执行之前输出执行时间："+ new Date());
    }*/

 /*   @Before(value = "execution(* *..SomeServiceImpl.do*(..))")
    public void myBefore(){
        System.out.println("3==前置通知，切面功能：在目标方法执行之前输出执行时间："+ new Date());
    }

    @Before(value = "execution(* *..SomeServiceImpl.do*(..))")
    public void myBefore2(){
        System.out.println("4==前置通知，切面功能：在目标方法执行之前输出执行时间："+ new Date());
    }

    @Before(value = "execution(* do*(..))")
    public void myBefore3(){
        System.out.println("5==前置通知，切面功能：在目标方法执行之前输出执行时间："+ new Date());
    }*/

    /*
    指定通知方法中的参数 ：JoinPoint
    JoinPoint：业务方法，要加入切面功能的业务方法
        作用：获取方法执行时的信息，例如方法的名称和实参
        参数值由框架赋予，必须是第一位置的参数
     */
    @Before(value = "execution(* *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(JoinPoint joinPoint){
        //获取方法的完整定义
        System.out.println("方法的签名（定义）="+joinPoint.getSignature());
        System.out.println("方法的名称="+joinPoint.getSignature().getName());
        Object args[] = joinPoint.getArgs();
        for (Object arg:args){
            System.out.println("参数="+arg);
        }
        System.out.println("2==前置通知，切面功能：在目标方法执行之前输出执行时间："+ new Date());
    }
}
