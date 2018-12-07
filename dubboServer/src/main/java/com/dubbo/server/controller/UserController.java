package com.dubbo.server.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//    @Reference(url = "dubbo://127.0.0.1:20880")
    @Reference
    @Autowired
    UserService userService;
    @RequestMapping("/getUserName")
    public  String userName(){
        return userService.queryUserName("gesy");
    }
}
