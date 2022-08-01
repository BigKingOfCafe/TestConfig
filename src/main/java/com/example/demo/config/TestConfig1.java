package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: LQ;
 * @Date: 2022/8/1 16:04
 * @Version 1.0
 * @Description:
 */
@Configuration
@Import(TestConfig.class)
public class TestConfig1 {
    public TestConfig1(){
        System.out.println("TestConfig1 加载成功");
    }
}
