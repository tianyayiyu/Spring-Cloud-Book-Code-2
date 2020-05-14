package com.zlu.controller;

import api.User;
import api.UserRemoteClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @description: 11
 * @author: zhanglu
 * @create: 2020-05-14 08:51
 */
@RestController
public class DemoController implements UserRemoteClient {
    @Override
    public String getName() {
        return "zlu";
    }

    @Override
    public String getUserInfo(@RequestParam String name,@RequestParam int age) {
        return name+","+age;
    }

    @Override
    public String getUserDetail(@RequestParam Map<String, Object> map) {
        return map.get("name").toString();
    }

    @Override
    public String addUser(@RequestBody User user) {
        user.setName("zzz");
        return user.getName();
    }
}
