package com.chenlie.shangjiaserver.controller;

import com.chenlie.shangjiaserver.pojo.Users;
import com.chenlie.shangjiaserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Resource
    @LoadBalanced
    private RestTemplate restTemplate;

    @RequestMapping("/go")
    @ResponseBody
    public List<Users> get(){
        List<Users> list = restTemplate.getForObject("http://userserver/go",List.class);
        return  list;
    }
    @RequestMapping("/gogo")
    public String getUser(HttpSession session){
        List<Users> list = userService.getAll();
        session.setAttribute("users",list);
        session.setAttribute("name","你麻痹");
        return "demo2.html";
    }
    @RequestMapping("/mongo1")
    @ResponseBody
    public String mongoinsert(){
        List<Users> list = new ArrayList<Users>();
        Users u1 = new Users(4,"chenlie","123456","187656755","niubi");
        Users u2 = new Users(5,"chenlie","123456","187656755","niubi");
        mongoTemplate.insert(list,"srsdrg");
        return "插入成功!";
    }




}
