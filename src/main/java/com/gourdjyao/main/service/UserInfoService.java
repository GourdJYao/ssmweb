package com.gourdjyao.main.service;

import com.gourdjyao.main.entry.UserInfo;
import com.gourdjyao.main.mapper.UserInfoMapper;
import com.gourdjyao.main.service.serviceinterface.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userInfoService")
public class UserInfoService implements IUserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void login(String username, String password) {
        try {
            UserInfo userInfo = userInfoMapper.selectUserById(1);
            System.out.println("username:"+username+";password:"+password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
