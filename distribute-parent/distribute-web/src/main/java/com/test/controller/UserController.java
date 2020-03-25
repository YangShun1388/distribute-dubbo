package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        List<User> allUser = userService.getAllUser();
        for (User user:allUser) {
            System.out.println(user.toString());
        }
        return "success";
    }

}
