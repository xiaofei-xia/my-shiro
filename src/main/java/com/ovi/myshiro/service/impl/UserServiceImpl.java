package com.ovi.myshiro.service.impl;

import com.ovi.myshiro.entity.User;
import com.ovi.myshiro.mapper.UserMapper;
import com.ovi.myshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yxfstart
 * @create 2021-04-20 15:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByAccount(String account) {
        return userMapper.findByAccount(account);
    }
}
