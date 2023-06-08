package com.wlwq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        String userName = context.getEnvironment().getProperty("user.name");
        String userAge = context.getEnvironment().getProperty("user.age");
        System.out.println("### username=" + userName + "  age=" + userAge);

    }
}