package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @SpringBootApplication:主程序类
 */
@SpringBootApplication(scanBasePackages = "com.atguigu")
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    /**
     * Spring Boot HelloWorld步骤：
     *  1.引入Spring-Boot依赖
     *  2.编写主方法（写法固定），编写代码。（注意：代码需在boot的目录下）
     *  3.运行主程序测试
     */
    /**
     * Spring Boot  （Boot ：启动）
     */

}
