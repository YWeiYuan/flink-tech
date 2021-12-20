/*
 * Copyright 2012-2022
 */
package com.weiyuan.learn.java8.lambda.exercise;

import com.weiyuan.learn.java8.lambda.data.Person;

import java.util.TreeSet;

/**
 * 一句话说明描述功能
 *
 * @author longquan.huang
 * @version 1.0
 * @date 2021/12/8 10:52 PM
 */
public class Exercise2 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>(((o1, o2) -> o2.getAge()- o1.getAge()));
        set.add(new Person(12, "zhangsan"));
        set.add(new Person(11, "lisi"));
        set.add(new Person(112, "wang5"));
        set.add(new Person(2, "ch"));
        set.add(new Person(32, "lisa"));
        set.add(new Person(1, "ls"));
        set.add(new Person(10000, "huang"));
        System.out.println(set);

    }
}
