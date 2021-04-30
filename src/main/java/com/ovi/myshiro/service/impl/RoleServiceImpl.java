package com.ovi.myshiro.service.impl;

import com.ovi.myshiro.entity.Role;
import com.ovi.myshiro.mapper.RoleMapper;
import com.ovi.myshiro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yxfstart
 * @create 2021-04-20 15:45
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findRoleByUserId(Integer id) {
        return roleMapper.findRoleByUserId(id);
    }
}
