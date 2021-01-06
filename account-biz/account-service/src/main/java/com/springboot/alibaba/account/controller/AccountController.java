package com.springboot.alibaba.account.controller;

import com.springboot.alibaba.account.response.AccountVO;
import com.springboot.alibaba.account.serivce.AccountService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/account/insert")
    public AccountVO insert(AccountVO accountVO) {
        log.info("insert account:{}", accountVO);
        return accountService.insertAccount(accountVO);
    }

    @PostMapping("/account/delete")
    public int delete(@RequestParam String accountCode) {
        log.info("delete account,accountCode is {}", accountCode);
        return accountService.deleteAccount(accountCode);
    }

    @PostMapping("/account/update")
    public AccountVO update(AccountVO accountVO) {
        log.info("update account:{}", accountVO);
        return accountService.updateAccount(accountVO);
    }

    @GetMapping("/account/{accountCode}")
    public AccountVO getByCode(@PathVariable String accountCode) {
        log.info("get account detail,accountCode is :{}", accountCode);
        return accountService.selectByCode(accountCode);
    }
}