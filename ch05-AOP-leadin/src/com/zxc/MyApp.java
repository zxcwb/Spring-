package com.zxc;

import com.zxc.handler.MyInvocationHandler;
import com.zxc.service.SomeService;
import com.zxc.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        //调用doSome，doOther方法
        /*SomeService service = new SomeServiceImpl();
        service.doOther();
        System.out.println("=============================================================");
        service.doSome();*/

        //使用jdk的proxy创建代理对象
        SomeService target = new SomeServiceImpl();

        //创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(target);

        //使用Proxy创建代理
        SomeService proxy = (SomeService)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
        System.out.println("proxy="+proxy.getClass().getName());
        //通过代理执行方法，会调用handler的invoke
        proxy.doOther();
        System.out.println("=============================================================");
        proxy.doSome();
    }
}
