/*
 * Copyright 2012-2022
 */
package com.weiyuan.learn.java8.lambda.exercise;

import com.weiyuan.learn.java8.lambda.data.Person;

import java.util.ArrayList;

/**
 * 一句话说明描述功能
 *
 * @author longquan.huang
 * @version 1.0
 * @date 2021/12/8 10:46 PM
 */
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(12, "zhangsan"));
        list.add(new Person(11, "lisi"));
        list.add(new Person(112, "wang5"));
        list.add(new Person(2, "ch"));
        list.add(new Person(32, "lisa"));
        list.add(new Person(1, "ls"));
        list.add(new Person(10000, "huang"));
        list.sort(((o1, o2) -> o2.getAge() - o1.getAge()));
        System.out.println(list);
    }
}
