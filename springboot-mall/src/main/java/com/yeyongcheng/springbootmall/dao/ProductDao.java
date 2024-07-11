package com.yeyongcheng.springbootmall.dao;

import com.yeyongcheng.springbootmall.dto.ProductQueryParams;
import com.yeyongcheng.springbootmall.dto.ProductRequest;
import com.yeyongcheng.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
