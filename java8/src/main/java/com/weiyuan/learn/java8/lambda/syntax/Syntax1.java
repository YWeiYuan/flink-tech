/*
 * Copyright 2012-2022
 */
package com.weiyuan.learn.java8.lambda.syntax;

import com.weiyuan.learn.java8.lambda.interfaces.*;

/**
 * 一句话说明描述功能
 *
 * @author longquan.huang
 * @version 1.0
 * @date 2021/12/8 9:43 PM
 */
public class Syntax1 {
    public static void main(String[] args) {
        // 无参数无返回值
        LambdaNoneReturnNoneParameter lambda1 = () -> {
            System.out.println("hello world");
        };
        lambda1.test();

        LambdaNoneReturnSingleParameter lambda2 = (int a) ->{
            System.out.println(a);
        };
        lambda2.test(20);

        LambdaNoneReturnMultiParameter lambda3 = (int a, String b) -> {
            System.out.println( a + b);
        };
        lambda3.test(12, "hello");

        LambdaSingleReturnNoneParameter lambda4 = () -> {
            int a = 121;
            return a;
        };
        int test = lambda4.test();
        System.out.println(test);

        LambdaSingleReturnSingleParameter lambda5 = (int a) -> {
            return a + 10;
        };

        lambda5.test(12);
        LambdaSingleReturnMultiParameter lambda6 = (int a, String b) -> {
            System.out.println(b);
            return a + b;
        };
        lambda6.test(1, "st");



    }
}
