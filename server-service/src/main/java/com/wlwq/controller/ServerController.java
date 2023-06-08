package com.wlwq.controller;


import com.wlwq.pojo.Product;
import com.wlwq.pojo.User;
import com.wlwq.service.ProductService;
import com.wlwq.service.UserService;
import com.wlwq.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @GetMapping("/handle")
    public String getHandle() {
        return "running server service...";
    }

    @GetMapping("/users")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProductList();
    }

}
