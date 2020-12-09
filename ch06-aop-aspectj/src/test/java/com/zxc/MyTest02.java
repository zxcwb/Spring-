package com.zxc;

import com.zxc.ba02.SomeService;
import com.zxc.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService)applicationContext.getBean("someService");
        Student student = proxy.doOther2("zs",28);
        System.out.println("student==="+student);
    }
}
