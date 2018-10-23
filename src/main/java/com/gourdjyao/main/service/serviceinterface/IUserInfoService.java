package com.gourdjyao.main.service.serviceinterface;

import com.gourdjyao.main.entry.UserInfo;

public interface IUserInfoService {
    UserInfo login(com.gourdjyao.main.http.bean.UserInfo userInfo) throws Exception;
    void register(UserInfo userInfo) throws Exception;
}
