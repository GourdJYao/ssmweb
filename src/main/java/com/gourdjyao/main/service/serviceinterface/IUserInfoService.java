package com.gourdjyao.main.service.serviceinterface;

import com.gourdjyao.main.entry.UserInfo;

public interface IUserInfoService {
    UserInfo login(UserInfo userInfo) throws Exception;
    void register(UserInfo userInfo) throws Exception;
    UserInfo selectUserInfo(String token) throws Exception;
}
