package com.zxc;

import com.zxc.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeServiceImpl proxy = (SomeServiceImpl)applicationContext.getBean("someService");
        System.out.println("proxy："+proxy.getClass().getName());
        //proxy：com.zxc.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$a9e461f5
        proxy.doThird();

    }
}
