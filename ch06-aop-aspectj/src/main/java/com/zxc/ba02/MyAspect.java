package com.zxc.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
   /* @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
        public void myAfterReturning(Object res){
        System.out.println("后置通知：目标方法执行之后执行的，获取的返回值是："+res);
        if (res.equals("abcd")){

        }else {

        }
        if (res != null){
            res = "Hello Aspectj";
        }
        }
*/
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther2(..))",returning = "res")
    public void myAfterReturning2(Object res){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student)applicationContext.getBean("myStudent");
        System.out.println("student==="+student);
        res = student;
        System.out.println("后置通知：目标方法执行之后执行的，获取的返回值是："+res);
        //作业
        //如果修改res的内容，属性值等，是不是会影响最后调用的结果
    }
}
