package com.wlwq.feign;

import com.wlwq.pojo.Product;
import com.wlwq.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "server-service", path = "/server")
public interface ServerFeign {

    @GetMapping("/handle")
    String getHandle();

    @GetMapping("/users")
    List<User> getUserList();

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") long id);

    @GetMapping("/products")
    List<Product> getProductList();


    String str=new String("ad");
}
