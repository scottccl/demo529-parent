package com.wlwq;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wlwq.mapper")
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        String userName = context.getEnvironment().getProperty("person.name");
        String userAge = context.getEnvironment().getProperty("person.age");
        System.out.println("### username=" + userName + "  age=" + userAge);
    }
}