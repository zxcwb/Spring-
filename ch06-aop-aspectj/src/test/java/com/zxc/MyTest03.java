package com.zxc;

import com.zxc.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService)applicationContext.getBean("someService");
        String string = proxy.doFirst("周绪驰",19);

    }
}
