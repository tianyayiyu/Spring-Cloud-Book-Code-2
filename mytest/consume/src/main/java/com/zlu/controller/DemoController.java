package com.zlu.controller;

import api.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 11
 * @author: zhanglu
 * @create: 2020-05-14 08:51
 */
@RestController
public class DemoController  {
    @Autowired
    private UserRemoteClient userRemoteClient;
    @GetMapping("/call")
    public String getName() {
        System.out.println("调用结果是："+userRemoteClient.getName());
        return userRemoteClient.getName();
    }
}
