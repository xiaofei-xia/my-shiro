package com.ovi.myshiro.mapper;

import com.ovi.myshiro.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yxfstart
 * @create 2021-04-20 15:35
 */
@Mapper
@Repository
public interface RoleMapper {

    List<Role> findRoleByUserId(@Param("userId") Integer userId);
}
