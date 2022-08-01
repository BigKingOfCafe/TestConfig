package com.example.demo.entity;

/**
 * @Author: LQ;
 * @Date: 2022/8/1 15:23
 * @Version 1.0
 * @Description:
 */
public class User {
    private String name;
    private int age;

    public void sayHello() {
        System.out.println("User sayHello...");
    }

    public void start() {
        System.out.println("User 初始化...");
    }

    public void cleanUp() {
        System.out.println("User 销毁...");
    }

}
