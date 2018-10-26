package com.gourdjyao.main.http.request;

import com.gourdjyao.main.entry.BusLineInfo;

public class BusLineInfoRequest extends BaseRequest {
    public BusLineInfo getData() {
        return data;
    }

    public void setData(BusLineInfo data) {
        this.data = data;
    }

    private BusLineInfo data;
}
