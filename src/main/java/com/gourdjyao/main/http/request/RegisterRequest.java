package com.gourdjyao.main.http.request;

import com.gourdjyao.main.http.bean.UserInfo;

public class RegisterRequest extends BaseRequest {

    private UserInfo data;

    public UserInfo getData() {
        return data;
    }

    public void setData(UserInfo data) {
        this.data = data;
    }
}
