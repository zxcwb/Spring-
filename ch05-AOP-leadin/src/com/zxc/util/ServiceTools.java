package com.zxc.util;

import java.util.Date;

public class ServiceTools {
    public static void doLog(){
        System.out.println("方法执行时间="+new Date());
    }
    public static void doTrans(){
        System.out.println("方法结束，提交事务");
    }
}
