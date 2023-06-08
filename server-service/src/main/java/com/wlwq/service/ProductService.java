package com.wlwq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlwq.pojo.Product;

import java.util.List;


public interface ProductService extends IService<Product> {

    List<Product> getProductList();
}
