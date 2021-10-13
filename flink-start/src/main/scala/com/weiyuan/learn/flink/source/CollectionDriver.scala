package com.weiyuan.learn.flink.source

import org.apache.flink.api.scala._
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

/**
 * flink的集合数据源
 * 将自定义的集合数据作为数据源，一般用来测试或者学习。
 *
 * @author longquan.huang
 * @date 2021/9/18 6:28 下午
 * @version 1.0
 */
object CollectionDriver {

  def main(args: Array[String]): Unit = {
    // 创建flink实时流的执行环境对象
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    // 获取集合数据源，flink会将实时流数据封装为DataStream进行操作
    val source = env.fromCollection(List(1, 2, 3, 4, 14, 15, 54, 5, 5, 7865, 5, 6, 6879, 979, 6))
    source.print()
    env.execute("flink-start1")
  }
}
