package com.gourdjyao.main.http.response;

public class LoginResponse extends BaseResponse{

    private LoginResult data;

    public LoginResult getData() {
        return data;
    }

    public void setData(LoginResult data) {
        this.data = data;
    }
}
