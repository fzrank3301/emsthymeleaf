package com.example.ems_thymeleaf.dao;

import com.example.ems_thymeleaf.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    void save(UserEntity user);

    UserEntity login(@Param("username")String username,@Param("password")String password);

}
