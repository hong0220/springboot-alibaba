package com.microservice.account.serivce;

import com.microservice.account.dto.AccountDTO;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public AccountDTO insertAccount(AccountDTO accountDTO) {
        return new AccountDTO(1L);
    }

    public int deleteAccount(String accountCode) {
        return 0;
    }

    public AccountDTO updateAccount(AccountDTO accountDTO) {
        return new AccountDTO(1L);
    }

    public AccountDTO selectByCode(String accountCode) {
        return new AccountDTO(1L);
    }
}