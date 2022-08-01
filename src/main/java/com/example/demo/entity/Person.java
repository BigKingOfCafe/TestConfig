package com.example.demo.entity;

/**
 * @Author: LQ;
 * @Date: 2022/8/1 15:56
 * @Version 1.0
 * @Description:
 */
public class Person {
    private String userName;
    private String password;
    private String url;

    public void sayHello() {
        System.out.println("Person sayHello...");
    }

    public void start() {
        System.out.println("Person 初始化...");
    }

    public void cleanUp() {
        System.out.println("Person 销毁...");
    }
}
