package com.zxc.service.impl;

import com.zxc.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("我是无参构造方法");
    }

    @Override
    public void dosome() {
        System.out.println("执行了SomeServiceImpl的dosome方法");
    }
}
