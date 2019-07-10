package com.chenlie.userserver.service.impl;

import com.chenlie.userserver.dao.UserMapper;
import com.chenlie.userserver.pojo.Users;
import com.chenlie.userserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Users> getAll() {
        List<Users> list = userMapper.getAll();
        return list;
    }
}
