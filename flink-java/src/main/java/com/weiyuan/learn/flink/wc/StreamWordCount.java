package com.weiyuan.learn.flink.wc;

import com.weiyuan.learn.flink.wc.funtion.MyFlatMapper;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.LocalStreamEnvironment;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Objects;

/**
 * 流处理wordCount
 * DataStream api
 * @author longquan.huang
 * @date 2021/9/18 6:28 下午
 * @version 1.0
 */
public class StreamWordCount {
    public static void main(String[] args) throws Exception {
        System.out.println("000000000000");
        // 创建流处理执行环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // 设置并行度为1，这就变成顺序读
        env.setParallelism(1);
        String path = Objects.requireNonNull(StreamWordCount.class.getResource("/hello.txt")).getPath();
        // 加载 hello.txt 文件作为输入流
        DataStreamSource<String> streamSource = env.readTextFile(path);
        // 对数据集进行处理,按照空格分词张开, 转换成 (word, 1) 二元组进行统计
        DataStream<Tuple2<String, Integer>> sum = streamSource.flatMap(new MyFlatMapper())
                // 按照第一个位置的hashcode重分区
                .keyBy(0)
                // 将第二个位置上的数据进行求和
                .sum(1);
        sum.print();
        // 执行起任务，等数据过来
        env.execute("stream flink job");
        System.out.println("222222222222222222222222222");
    }
}
