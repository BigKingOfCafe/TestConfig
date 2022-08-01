package com.example.demo.config;

import com.example.demo.entity.User;
import org.springframework.context.annotation.*;

/**
 * @Author: LQ;
 * @Date: 2022/8/1 15:11
 * @Version 1.0
 * @Description:
 */
@Configuration
//@ComponentScan(basePackages = "com.example.demo.entity")
@ImportResource(locations = "classpath:static/personconfig.xml")
public class TestConfig {
    public TestConfig(){
        System.out.println("加载配置");
    }

    /**
     * @Bean注解注册bean,同时可以指定初始化和销毁方法
     * @return
     */
//    @Bean(name="user",initMethod = "start",destroyMethod = "cleanUp")
//    @Scope
//    public User user(){
//        return new User();
//    }

}
