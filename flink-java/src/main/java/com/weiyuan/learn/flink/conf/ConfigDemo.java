package com.weiyuan.learn.flink.conf;

import org.apache.flink.api.java.utils.ParameterTool;

/**
 * 从配置文件 || 启动参数 提取参数
 * DataStream api
 * @author longquan.huang
 * @date 2021/9/18 6:28 下午
 * @version 1.0
 */
public class ConfigDemo {
    public static void main(String[] args) {
        // 启动参数加上  --host localhost --port 777
        ParameterTool args1 = ParameterTool.fromArgs(args);
        String host = args1.get("host");
        System.out.println("主机 " + host);
        int port = args1.getInt("port");
        System.out.println("端口号：" + port);

        // 从配置文件中获取

    }
}
