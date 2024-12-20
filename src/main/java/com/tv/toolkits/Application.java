package com.tv.toolkits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Pandora Boot应用的入口类
 */
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
// 启用组件扫描
@SpringBootApplication(scanBasePackages = "com.tv.toolkits")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

