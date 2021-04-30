package com.ovi.myshiro.service.impl;

import com.ovi.myshiro.mapper.PermissionMapper;
import com.ovi.myshiro.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yxfstart
 * @create 2021-04-20 15:40
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<String> findByRoleId(List<Integer> roleIds) {
        return permissionMapper.findByRoleId(roleIds);
    }

}
