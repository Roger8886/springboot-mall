package com.yeyongcheng.springbootmall.service;

import com.yeyongcheng.springbootmall.constant.ProductCategory;
import com.yeyongcheng.springbootmall.dto.ProductRequest;
import com.yeyongcheng.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
