package com.gourdjyao.main.http.request;

import com.gourdjyao.main.http.bean.UserInfo;

public class LoginRequest extends BaseRequest {
    public UserInfo getData() {
        return data;
    }

    public void setData(UserInfo data) {
        this.data = data;
    }

    private UserInfo data;
}
