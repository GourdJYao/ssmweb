package com.gourdjyao.main.service;

import com.gourdjyao.main.entry.BusLineInfo;
import com.gourdjyao.main.entry.UserInfo;
import com.gourdjyao.main.mapper.BusLineInfoMapper;
import com.gourdjyao.main.mapper.UserInfoMapper;
import com.gourdjyao.main.service.serviceinterface.IBusLineInfoService;
import com.gourdjyao.main.service.serviceinterface.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("busLineInfoService")
public class BusLineInfoService implements IBusLineInfoService {
    @Autowired
    private BusLineInfoMapper busLineInfoMapper;

    @Override
    public void saveBuslineInfo(BusLineInfo busLineInfo) throws Exception {
        busLineInfoMapper.insertBusLineInfo(busLineInfo);
    }
}
