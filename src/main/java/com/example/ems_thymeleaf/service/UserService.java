package com.example.ems_thymeleaf.service;

import com.example.ems_thymeleaf.entity.UserEntity;


public interface UserService {

    void regist(UserEntity user);

    UserEntity login(String username, String password);

}
