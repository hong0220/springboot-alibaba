package com.microservice.order.feign;

import com.microservice.account.dto.AccountDTO;
import com.microservice.response.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "account-service")
@Component
public interface AccountFeign {

    @PostMapping("/account/insert")
    ResultData<String> insert(@RequestBody AccountDTO accountDTO);

    @PostMapping("/account/delete")
    ResultData<String> delete(@RequestParam("accountCode") String accountCode);

    @PostMapping("/account/update")
    ResultData<String> update(@RequestBody AccountDTO accountDTO);

    @GetMapping("/account/getByCode/{accountCode}")
    ResultData<AccountDTO> getByCode(@PathVariable(value = "accountCode") String accountCode);
}