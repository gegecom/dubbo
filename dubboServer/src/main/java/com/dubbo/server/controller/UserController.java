package com.dubbo.server.controller;

import com.dubbo.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("getUserName")
    public  String userName(){
        return userService.queryUserName("gesy");
    }
}
