package com.weiyuan.learn.flink.source.wc;

import com.weiyuan.learn.flink.source.wc.funtion.MyFlatMapper;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.tuple.Tuple2;

import java.util.Objects;

/**
 * 批处理处理wordCount
 * 是使用 DataSet api
 *
 * @author longquan.huang
 * @date 2021/9/18 6:28 下午
 * @version 1.0
 */
public class WordCount {
    public static void main(String[] args) throws Exception {
        // 创建批处理执行环境
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        String path = Objects.requireNonNull(WordCount.class.getResource("/hello.txt")).getPath();
        // 加载 hello.txt 文件作为输入流
        DataSource<String> dataSource = env.readTextFile(path);
        // 对数据集进行处理,按照空格分词张开, 转换成 (word, 1) 二元组进行统计
        DataSet<Tuple2<String, Integer>> sum = dataSource.flatMap(new MyFlatMapper())
                // 按照第一个位置的word分组
                .groupBy(0)
                // 将第二个位置上的数据进行求和
                .sum(1);
        sum.print();
    }
}
