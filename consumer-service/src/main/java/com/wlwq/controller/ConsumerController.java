package com.wlwq.controller;


import com.wlwq.feign.ServerFeign;
import com.wlwq.pojo.Product;
import com.wlwq.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ServerFeign serverFeign;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        System.out.println("consumer run...");
//        String res = restTemplate.getForObject("http://server-service/server/handle", String.class);
//        return "consumer run..." + res;
        return "consumer run..." + serverFeign.getHandle();
    }

    @GetMapping("/users")
    public List<User> getUserList(){
        return serverFeign.getUserList();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return serverFeign.getUserById(id);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return serverFeign.getProductList();
    }


}
