package com.weiyuan.learn.flink.source

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

/**
 * flink 文件数据源
 *
 * @author longquan.huang
 * @date 2021/9/18 7:51 下午
 * @version 1.0
 */
object FileDriver {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val source = env.readTextFile("/Users/huanglongquan/work/codes/flink-tech/flink-start/src/main/resources/01.text")
    source.print()
    env.execute()
  }
}
