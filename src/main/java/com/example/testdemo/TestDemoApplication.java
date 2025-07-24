package com.example.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 启动类 */
@SpringBootApplication
public class TestDemoApplication {

    public static void main(String[] args) {
        System.out.println("启动SpringBoot程序");
        System.out.println("sweet sexy savage");
        SpringApplication.run(TestDemoApplication.class, args);
    }

}
