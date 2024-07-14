package com.yeyongcheng.springbootmall.service;

import com.yeyongcheng.springbootmall.dto.UserRegisterRequest;
import com.yeyongcheng.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
