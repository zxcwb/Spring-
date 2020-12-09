package com.zxc.service.impl;

import com.zxc.service.SomeService;
import com.zxc.util.ServiceTools;

import java.util.Date;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");
    }
}
