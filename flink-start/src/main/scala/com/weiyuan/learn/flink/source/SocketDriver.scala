package com.weiyuan.learn.flink.source

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

/**
 * flink的socket数据源，这是练习或者测试中最常用的
 *
 * @author longquan.huang
 * @date 2021/9/18 7:43 下午
 * @version 1.0
 */
object SocketDriver {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val source = env.socketTextStream("localhost", 8888)
    source.print()
    env.execute()
  }
}
