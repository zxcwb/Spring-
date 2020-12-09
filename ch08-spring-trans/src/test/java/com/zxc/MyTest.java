package com.zxc;

import com.zxc.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //从容器中获取service
        BuyGoodsService service = (BuyGoodsService)applicationContext.getBean("buyService");
        //调用方法
        service.buy(1001,200);
    }
}
