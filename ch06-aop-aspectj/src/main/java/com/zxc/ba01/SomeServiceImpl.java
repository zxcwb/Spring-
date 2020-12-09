package com.zxc.ba01;

import com.zxc.ba01.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {
        //给doSome方法增加一个功能，doSome执行之前输出方法的时间
        System.out.println("目标方法doSome方法执行了！");
    }
}
