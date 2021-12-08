package com.weiyuan.learn.flink.source.wc.funtion;

import org.apache.flink.api.common.functions.FlatMapFunction;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

/**
 * @author huanglongquan
 */
public class MyFlatMapper implements FlatMapFunction<String, Tuple2<String, Integer>> {

    @Override
    public void flatMap(String value, Collector<Tuple2<String, Integer>> out) throws Exception {
        // 按照空格分隔分词
        String[] words = value.split(" ");
        // 遍历所有word 包装成二元组
        for (String word : words) {
            Tuple2<String, Integer> tuple2 = new Tuple2<>(word, 1);
            out.collect(tuple2);
        }
    }
}
