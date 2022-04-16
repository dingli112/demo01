package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author zhao ding
 * @date 2022/4/16 - 下午10:13
 */
@RestController
@RequestMapping("/api/v1/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("save")
    public User save(){
        User user = new User();
        user.setName("滴滴上");
        user.setPhone(Math.random() * 1000 + "");
        userService.save(user);
        return user;
    }

}
