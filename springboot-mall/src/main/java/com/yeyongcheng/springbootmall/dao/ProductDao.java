package com.yeyongcheng.springbootmall.dao;

import com.yeyongcheng.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
