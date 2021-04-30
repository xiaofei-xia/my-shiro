package com.ovi.myshiro.service;

import com.ovi.myshiro.entity.User;

/**
 * @author yxfstart
 * @create 2021-04-20 15:47
 */
public interface UserService {

    User findByAccount(String account);
}
