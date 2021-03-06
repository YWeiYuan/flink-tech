package com.weiyuan.learn.flink.source

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

/**
 * flink的socket数据源，这是练习或者测试中最常用的
 * 安装nc win版本在resources中 命令是：nc -L -p 9999
 * linux 版本是 yum install nc -y
 * 命令： nc -l 9999
 * 需要先启动nc监听之后，运行flink
 *
 * @author longquan.huang
 * @date 2021/9/18 7:43 下午
 * @version 1.0
 */
object SocketDriver {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val source = env.socketTextStream("localhost", 9999)
    source.print()
    env.execute()
  }
}
