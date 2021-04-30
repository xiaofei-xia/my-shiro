package com.ovi.myshiro.mapper;

import com.ovi.myshiro.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author yxfstart
 * @create 2021-04-20 15:38
 */
@Mapper
@Repository
public interface UserMapper {

    User findByAccount(@Param("account") String account);
}
