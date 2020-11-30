package com.zxc.service.impl;

import com.zxc.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome() {
        System.out.println("执行了SomeServiceImpl的dosome方法");
    }
}
