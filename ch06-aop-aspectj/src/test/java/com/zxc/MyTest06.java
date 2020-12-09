package com.zxc;

import com.zxc.ba06.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest06 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService)applicationContext.getBean("someService");
        System.out.println("proxy："+proxy.getClass().getName());
        proxy.doThird();

    }
}
