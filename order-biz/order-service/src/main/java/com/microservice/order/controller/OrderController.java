package com.microservice.order.controller;

import com.microservice.account.dto.AccountDTO;
import com.microservice.order.feign.AccountFeign;
import com.microservice.order.service.OrderService;
import com.microservice.response.ResultData;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class OrderController {
    @Autowired
    private AccountFeign accountFeign;
    @Autowired
    private OrderService orderService;

    @PostMapping("/order/getAccount/{accountCode}")
    public ResultData<AccountDTO> getAccount(@PathVariable String accountCode) {
        return accountFeign.getByCode(accountCode);
    }

    @PostMapping("/order/insertAccount")
    public ResultData<String> insertAccount(AccountDTO accountDTO) {
        return accountFeign.insert(accountDTO);
    }

    @PostMapping("/order/updateAccount")
    public ResultData<String> updateAccount(AccountDTO accountDTO) {
        return accountFeign.update(accountDTO);
    }

    @PostMapping("/order/deleteAccount/{accountCode}")
    public ResultData<String> deleteAccount(@PathVariable String accountCode) {
        return accountFeign.delete(accountCode);
    }
}