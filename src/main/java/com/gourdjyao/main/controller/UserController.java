package com.gourdjyao.main.controller;

import com.gourdjyao.main.service.serviceinterface.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Autowired
    IUserInfoService userInfoService;

    @RequestMapping("/login")
    public String login(String userName, String password) {
        userInfoService.login(userName, password);
        return "success";
    }
}
