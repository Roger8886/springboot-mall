package com.yeyongcheng.springbootmall.dao;

import com.yeyongcheng.springbootmall.dto.UserRegisterRequest;
import com.yeyongcheng.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
