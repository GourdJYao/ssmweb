package com.gourdjyao.main.http.response;

public class LoginResult extends BaseResult {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
