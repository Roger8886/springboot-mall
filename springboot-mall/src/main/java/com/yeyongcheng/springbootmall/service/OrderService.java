package com.yeyongcheng.springbootmall.service;

import com.yeyongcheng.springbootmall.dto.CreateOrderRequest;
import com.yeyongcheng.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
