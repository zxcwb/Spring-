package com.zxc;

import com.zxc.service.SomeService;
import com.zxc.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class myTest {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.dosome();
    }

    @Test
    public void test02(){
        //指定配置文件
        String config = "beans.xml";
        //创建表示spring容器的对象  ApplicationContext  通过容器获取对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //从容器中获取某个对象，你要调用的对象的方法，getBean(配置文件中bean的id值)
        SomeService someService = (SomeService)applicationContext.getBean("someService");
        //使用spring创建好的对象调用方法
        someService.dosome();
    }

    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        System.out.println(applicationContext.getBeanDefinitionCount());
        System.out.println(applicationContext.getBeanDefinitionNames());
    }
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Date date = (Date)applicationContext.getBean("myDate");
        System.out.println(date);
    }
}
