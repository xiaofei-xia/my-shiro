package com.ovi.myshiro.util;

import com.ovi.myshiro.entity.Role;
import com.ovi.myshiro.entity.User;
import com.ovi.myshiro.service.PermissionService;
import com.ovi.myshiro.service.RoleService;
import com.ovi.myshiro.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author yxfstart
 * @create 2021-04-20 16:03
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    // 用户授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        List<Role> roleList = roleService.findRoleByUserId(user.getId());
        Set<String> roleSet = new HashSet<>();
        List<Integer> roleIds = new ArrayList<>();
        for (Role role : roleList) {
            roleSet.add(role.getRole());
            roleIds.add(role.getId());
        }
        // 放入角色信息
        authorizationInfo.setRoles(roleSet);
        // 放入权限信息
        List<String> permissionList = permissionService.findByRoleId(roleIds);
        authorizationInfo.setStringPermissions(new HashSet<>(permissionList));

        return authorizationInfo;
    }

    // 用户认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authToken;
        User user = userService.findByAccount(token.getUsername());
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
    }
}
