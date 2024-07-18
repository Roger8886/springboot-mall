package com.yeyongcheng.springbootmall.service;

import com.yeyongcheng.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
