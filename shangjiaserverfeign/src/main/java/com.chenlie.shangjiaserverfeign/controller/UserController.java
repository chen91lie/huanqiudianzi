package com.chenlie.shangjiaserverfeign.controller;

import com.chenlie.pojo.Users;
import com.chenlie.shangjiaserverfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/go")
    @ResponseBody
    public List<Users> get(){
        List<Users> list = userService.getAll();
        return  list;
    }





}
