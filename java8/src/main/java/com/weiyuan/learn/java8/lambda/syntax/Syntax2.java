/*
 * Copyright 2012-2022
 */
package com.weiyuan.learn.java8.lambda.syntax;

import com.weiyuan.learn.java8.lambda.interfaces.LambdaNoneReturnMultiParameter;
import com.weiyuan.learn.java8.lambda.interfaces.LambdaNoneReturnNoneParameter;
import com.weiyuan.learn.java8.lambda.interfaces.LambdaSingleReturnMultiParameter;
import com.weiyuan.learn.java8.lambda.interfaces.LambdaSingleReturnSingleParameter;

/**
 * 一句话说明描述功能
 *
 * @author longquan.huang
 * @version 1.0
 * @date 2021/12/8 9:58 PM
 */
public class Syntax2 {
    public static void main(String[] args) {
        //1.参数
        //因为在接口的抽象方法中，已经定义了参数的数量和类型，所有在lambda表达式中参数类型是可以省略的。
        //注意：要么都省略，要么都不省略。
        LambdaNoneReturnMultiParameter lambda1 = (a, b) -> {
            System.out.println(a + b);
        };
        lambda1.test(11, "string");
        // 2. 参数小括号
        //如果参数列表中，参数的数量只有一个，此时小括号是可以省略。
        LambdaSingleReturnSingleParameter lambda2 = a -> {
            System.out.println(a);
            return a + 10;
        };
        lambda2.test(121);

        // 3. 方法大括号
        //如果方法中只有一条语句，此时大括号可以省略。跟if 很相似。
        LambdaNoneReturnMultiParameter lambda3 = (a, b) -> System.out.println(a+b);
        lambda3.test(12, "sdfsdgg");

        // 4. 如果方法体中唯一一条语句是返回语句，那么return可以省略。
        LambdaSingleReturnMultiParameter lambda4 = (a, b) -> a + b;
        String test = lambda4.test(121, "aaadsfsdf");
        System.out.println(test);

    }
}
