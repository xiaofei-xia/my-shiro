package com.ovi.myshiro.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yxfstart
 * @create 2021-04-20 15:22
 */
@Mapper
@Repository
public interface PermissionMapper {

    List<String> findByRoleId(@Param("roleIds") List<Integer> roleIds);
}
