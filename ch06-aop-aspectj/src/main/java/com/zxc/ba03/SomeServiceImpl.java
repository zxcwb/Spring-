package com.zxc.ba03;

import com.zxc.ba02.Student;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {
        //给doSome方法增加一个功能，doSome执行之前输出方法的时间
        System.out.println("目标方法doSome方法执行了！");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("目标方法doOther()");
        return "abcd";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        Student student  = new Student();
        student.setName(name);
        student.setAge(age);
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("===业务方法doFirst()===");
        return "doFirst";
    }
}
