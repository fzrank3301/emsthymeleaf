package com.example.ems_thymeleaf.service;

import com.example.ems_thymeleaf.dao.UserMapper;
import com.example.ems_thymeleaf.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class UserServiceimpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void regist(UserEntity user) {
        user.setId(UUID.randomUUID().toString());
        userMapper.save(user);
    }

    @Override
    public UserEntity login(String username, String password) {
        UserEntity login = userMapper.login(username, password);
        return  login;
    }
}
