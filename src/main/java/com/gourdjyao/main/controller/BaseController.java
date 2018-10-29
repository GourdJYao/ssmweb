package com.gourdjyao.main.controller;

import com.gourdjyao.main.entry.UserInfo;
import com.gourdjyao.main.service.serviceinterface.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {
    @Autowired
    IUserInfoService userInfoService;

    protected UserInfo isToken(Object object) {
        return null;
    }
}
