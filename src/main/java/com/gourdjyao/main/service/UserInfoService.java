package com.gourdjyao.main.service;

import com.gourdjyao.main.entry.UserInfo;
import com.gourdjyao.main.mapper.UserInfoMapper;
import com.gourdjyao.main.service.serviceinterface.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("userInfoService")
public class UserInfoService implements IUserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo login(com.gourdjyao.main.http.bean.UserInfo userInfoRequst) throws Exception {
        UserInfo userInfo = userInfoMapper.selectUserByUserName(userInfoRequst);
        if (userInfo != null) {
            String uuid = UUID.randomUUID().toString();
            userInfo.setToken(uuid);
            userInfoMapper.updateUser(userInfo);
        }
        return userInfo;
    }

    @Override
    public void register(UserInfo userInfo) throws Exception {
        userInfoMapper.insertUser(userInfo);
    }
}
