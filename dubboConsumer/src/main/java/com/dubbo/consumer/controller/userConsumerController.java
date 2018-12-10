package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class userConsumerController {
    @Autowired
    @Reference
    UserService userService;
    @RequestMapping("/getConsumerUserName")
    public String getUserName(){
//        return  userService.getUserName();
        return  "";
    }

}
