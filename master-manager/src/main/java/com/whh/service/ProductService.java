package com.whh.service;

import com.whh.mapper.ProductMapper;
import com.whh.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService
 * Created by xuzhuo on 2018/3/1.
 */
@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<Product> productList() {
        return productMapper.queryProductList();
    }
}
