/*
 * Copyright 2012-2022
 */
package com.weiyuan.learn.java8.lambda.syntax;

import com.weiyuan.learn.java8.lambda.interfaces.LambdaSingleReturnSingleParameter;

/**
 * 一句话说明描述功能
 *
 * @author longquan.huang
 * @version 1.0
 * @date 2021/12/8 10:11 PM
 */
public class Syntax3 {
    public static void main(String[] args) {
        // 方法引用
        LambdaSingleReturnSingleParameter lambda1 = a -> a * 2;
        LambdaSingleReturnSingleParameter lambda2 = a -> change(a);
        // 可以快速的将一个lambda表达式指向一个已经实现的方法。
        // 语法： 方法的隶属者::方法名
        LambdaSingleReturnSingleParameter lambda3 = Syntax3::change;

    }

    public static int change(int a) {
        return a * 2;
    }
}
