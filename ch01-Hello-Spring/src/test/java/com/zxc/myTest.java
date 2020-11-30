package com.zxc;

import com.zxc.service.SomeService;
import com.zxc.service.impl.SomeServiceImpl;
import org.junit.Test;

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

    }
}
