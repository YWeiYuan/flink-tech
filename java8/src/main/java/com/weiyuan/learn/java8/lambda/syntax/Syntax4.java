/*
 * Copyright 2012-2022
 */
package com.weiyuan.learn.java8.lambda.syntax;

import com.weiyuan.learn.java8.lambda.data.Person;

/**
 * 一句话说明描述功能
 *
 * @author longquan.huang
 * @version 1.0
 * @date 2021/12/8 10:25 PM
 */
public class Syntax4 {
    public static void main(String[] args) {
        PersonCreator creator = () -> new Person();

        // 构造方法的引用
        PersonCreator creator1 = Person::new;
        creator1.getPerson();

        PersonCreator2 creator2 = Person::new;
        creator2.getPerson(12, "小明");
    }

}

interface PersonCreator {
    Person getPerson();
}


interface PersonCreator2 {
    Person getPerson(int age, String name);
}