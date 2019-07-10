package com.chenlie.shangjiaserver.service.impl;

import com.chenlie.shangjiaserver.dao.UserMapper;
import com.chenlie.shangjiaserver.pojo.Users;
import com.chenlie.shangjiaserver.service.UserService;
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
