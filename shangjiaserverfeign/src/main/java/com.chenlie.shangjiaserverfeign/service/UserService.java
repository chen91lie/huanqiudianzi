package com.chenlie.shangjiaserverfeign.service;

import com.chenlie.pojo.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("userserver")
public interface UserService {
    @RequestMapping("/go")
    public List<Users> getAll();
}
