package com.microservice.order.response;

public class OrderVO {

    private Long id;

    public OrderVO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}