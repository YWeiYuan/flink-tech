/*
 * Copyright 2012-2022
 */
package com.weiyuan.learn.java8.lambda.data;

/**
 * 一句话说明描述功能
 *
 * @author longquan.huang
 * @version 1.0
 * @date 2021/12/8 10:23 PM
 */
public class Person {
    private int age;
    private String name;

    public Person() {
        System.out.println("无参数的构造方法执行了");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("有参数的构造方法执行了");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
