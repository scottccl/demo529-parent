package com.wlwq.service.impl;

//import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wlwq.mapper.ProductMapper;
import com.wlwq.pojo.Product;
import com.wlwq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@DS("slave")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    public List<Product> getProductList(){
        return productMapper.selectList(null);
    };

}
