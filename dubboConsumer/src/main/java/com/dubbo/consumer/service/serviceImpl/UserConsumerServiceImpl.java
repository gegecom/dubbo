package com.dubbo.consumer.service.serviceImpl;

import com.dubbo.consumer.service.UserConsumerService;
import com.dubbo.consumer.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

@Component
public class UserConsumerServiceImpl implements UserConsumerService{
    @Reference()
    private  UserService userService;

    public String getUserName(){

        return userService.queryUserName("geshiying");

    }
}
