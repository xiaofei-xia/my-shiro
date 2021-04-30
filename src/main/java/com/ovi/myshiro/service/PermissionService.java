package com.ovi.myshiro.service;

import java.util.List;

/**
 * @author yxfstart
 * @create 2021-04-20 15:42
 */
public interface PermissionService {

    List<String> findByRoleId(List<Integer> roleIds);
}
