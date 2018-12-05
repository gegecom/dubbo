package com.dubbo.server.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class User {
    private  String name;
    private  String password;
    private Integer age;
    private Date birthday;
    private String desc;


}
