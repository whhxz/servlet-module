package com.whh.controller;

import com.whh.model.Product;
import com.whh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * UseController
 * Created by xuzhuo on 2018/3/1.
 */
@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("index")
    public String index() {
        return "product/index";
    }

    @RequestMapping("productList")
    @ResponseBody
    public List<Product> productList() {
        return productService.productList();
    }
}
