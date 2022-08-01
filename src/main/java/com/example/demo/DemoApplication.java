package com.example.demo;

import com.example.demo.config.TestConfig;
import com.example.demo.config.TestConfig1;
import com.example.demo.entity.Person;
import com.example.demo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig1.class);
//
//        User bean = context.getBean(User.class);
//        bean.sayHello();
//        System.out.println(bean);
//
//        User bean1 = context.getBean(User.class);
//        System.out.println(bean1);
        Person bean = context.getBean(Person.class);
        bean.sayHello();
        System.out.println(bean);
    }

}
