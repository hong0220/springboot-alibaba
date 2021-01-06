package com.springboot.alibaba.account.response;

public class AccountVO {

    private Long id;

    public AccountVO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}