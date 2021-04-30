package com.ovi.myshiro.service;

import com.ovi.myshiro.entity.Role;

import java.util.List;

/**
 * @author yxfstart
 * @create 2021-04-20 15:45
 */
public interface RoleService {

    List<Role> findRoleByUserId(Integer id);
}
