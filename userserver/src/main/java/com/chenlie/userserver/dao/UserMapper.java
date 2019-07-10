package com.chenlie.userserver.dao;

import com.chenlie.userserver.pojo.Users;

import java.util.List;

public interface UserMapper {
    public List<Users> getAll();
}
