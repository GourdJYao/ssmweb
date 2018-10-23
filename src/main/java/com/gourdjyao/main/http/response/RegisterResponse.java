package com.gourdjyao.main.http.response;

public class RegisterResponse extends BaseResponse {
    private BaseResult data;

    public BaseResult getData() {
        return data;
    }

    public void setData(BaseResult data) {
        this.data = data;
    }
}
