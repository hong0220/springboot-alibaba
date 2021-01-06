package com.springboot.alibaba.order.controller;

import com.springboot.alibaba.order.service.OrderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class OrderController {
    @Autowired
    private OrderService orderService;
}