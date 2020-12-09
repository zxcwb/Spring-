package com.zxc.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    @Value("周绪驰")
    private String name;
    @Value("19")
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        System.out.println("student无参数构造方法！");
    }
}
