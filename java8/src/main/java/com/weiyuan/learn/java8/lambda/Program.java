/*
 * Copyright 2012-2022
 */
package com.weiyuan.learn.java8.lambda;

/**
 * lambda是一个匿名函数
 * 参数列表 方法体
 * () -> {}
 * () : 用来描述参数列表
 * {} : 用来描述方法体
 * -> : lambda的运算符， 读作 goes to
 *
 * @author longquan.huang
 * @version 1.0
 * @date 2021/12/8 9:20 PM
 */
public class Program {
    public static void main(String[] args) {
        // 1. 使用接口实现类
        Comparator comparator = new MyComparator();

        // 2. 使用匿名方法
        Comparator comparator1 = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a - b;
            }
        };
        // 3.使用lambda表达式
        Comparator comparator2 = (a, b) -> a - b;
        comparator.compare(1, 2);
    }
}


class MyComparator implements Comparator {

    @Override
    public int compare(int a, int b) {
        return a - b;
    }
}

interface Comparator {
    /**
     * 比较
     *
     * @param a 一个
     * @param b b
     * @return int
     */
    int compare(int a, int b);
}