package com.wlwq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther: Scott C C Liu
 * @create: 2023-05-31 16:12
 * @Description
 */

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wlwq.mapper")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
