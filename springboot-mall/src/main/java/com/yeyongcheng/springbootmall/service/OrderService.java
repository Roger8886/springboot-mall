package com.yeyongcheng.springbootmall.service;

import com.yeyongcheng.springbootmall.dto.CreateOrderRequest;
import com.yeyongcheng.springbootmall.dto.OrderQueryParams;
import com.yeyongcheng.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
