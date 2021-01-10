package com.microservice.product.controller;

import com.microservice.product.service.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class ProductController {
    @Autowired
    private ProductService productService;
}