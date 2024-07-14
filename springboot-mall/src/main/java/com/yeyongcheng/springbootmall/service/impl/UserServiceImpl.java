package com.yeyongcheng.springbootmall.service.impl;

import com.yeyongcheng.springbootmall.dao.UserDao;
import com.yeyongcheng.springbootmall.dto.UserRegisterRequest;
import com.yeyongcheng.springbootmall.model.User;
import com.yeyongcheng.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
