package com.microservice.account.controller;

import com.microservice.account.dto.AccountDTO;
import com.microservice.account.serivce.AccountService;
import com.microservice.response.ResultData;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/account/insert")
    public ResultData<String> insert(@RequestBody AccountDTO accountDTO) {
        log.info("insert account:{}", accountDTO);
        System.out.println("insert account success");

        accountService.insertAccount(accountDTO);
        return ResultData.success("insert account success");
    }

    @PostMapping("/account/delete")
    public ResultData<String> delete(@RequestParam("accountCode") String accountCode) {
        log.info("delete account,accountCode is {}", accountCode);
        System.out.println("delete account success");

        accountService.deleteAccount(accountCode);
        return ResultData.success("delete account success");
    }

    @PostMapping("/account/update")
    public ResultData<String> update(@RequestBody AccountDTO accountDTO) {
        log.info("update account:{}", accountDTO);
        System.out.println("delete account success");

        accountService.updateAccount(accountDTO);
        return ResultData.success("update account success");
    }

    @GetMapping("/account/getByCode/{accountCode}")
    public ResultData<AccountDTO> getByCode(@PathVariable(value = "accountCode") String accountCode) {
        log.info("get account detail,accountCode is :{}", accountCode);
        System.out.println("getByCode success");

        AccountDTO accountDTO = accountService.selectByCode(accountCode);
        return ResultData.success(accountDTO);
    }
}