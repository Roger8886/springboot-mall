package com.yeyongcheng.springbootmall.service;

import com.yeyongcheng.springbootmall.dto.UserLoginRequest;
import com.yeyongcheng.springbootmall.dto.UserRegisterRequest;
import com.yeyongcheng.springbootmall.model.User;
import jakarta.validation.Valid;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(@Valid UserLoginRequest userRegisterRequest);
}
