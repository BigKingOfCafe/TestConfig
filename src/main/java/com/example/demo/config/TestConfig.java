package com.example.demo.config;

import com.example.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author: LQ;
 * @Date: 2022/8/1 15:11
 * @Version 1.0
 * @Description:
 */
@Configuration
public class TestConfig {
    public TestConfig(){
        System.out.println("加载配置");
    }

    @Bean(name="user",initMethod = "start",destroyMethod = "cleanUp")
    @Scope("prototype")
    public User user(){
        return new User();
    }

}
