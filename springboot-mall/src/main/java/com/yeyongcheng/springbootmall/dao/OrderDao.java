package com.yeyongcheng.springbootmall.dao;

import com.yeyongcheng.springbootmall.dto.OrderQueryParams;
import com.yeyongcheng.springbootmall.model.Order;
import com.yeyongcheng.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
