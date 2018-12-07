package com.dubbo.server.service.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.UserService;
import org.springframework.stereotype.Component;


@Service(interfaceClass = UserService.class, retries = 0)
@Component
public class UserServiceImpl implements UserService {

    public String queryUserName(String userName){
        return userName;
    }
}
