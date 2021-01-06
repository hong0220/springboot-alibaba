package com.springboot.alibaba.account.serivce;

import com.springboot.alibaba.account.response.AccountVO;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public AccountVO insertAccount(AccountVO accountVO) {
        return new AccountVO(1L);
    }

    public int deleteAccount(String accountCode) {
        return 0;
    }

    public AccountVO updateAccount(AccountVO accountVO) {
        return new AccountVO(1L);
    }

    public AccountVO selectByCode(String accountCode) {
        return new AccountVO(1L);
    }
}