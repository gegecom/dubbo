package com.dubbo.consumer.controller;

import com.dubbo.consumer.service.UserConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class userConsumerController {
    @Autowired
    UserConsumerService userConsumerService;
    @RequestMapping("/getConsumerUserName")
    public String getUserName(){
        return  userConsumerService.getUserName();
    }

}
