package com.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.entity.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }
}
