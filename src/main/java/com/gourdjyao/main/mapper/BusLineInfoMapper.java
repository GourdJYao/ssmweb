package com.gourdjyao.main.mapper;

import com.gourdjyao.main.entry.BusLineInfo;
import com.gourdjyao.main.entry.UserInfo;

import java.util.List;

public interface BusLineInfoMapper {
    int insertBusLineInfo(BusLineInfo busLineInfo) throws Exception;

    int updateBusLineInfo(BusLineInfo busLineInfo) throws Exception;

    int deleteBusLineInfo(int id) throws Exception;

    BusLineInfo selectBusLineInfoById(int id) throws Exception;

    List<BusLineInfo> selectBusLineInfoByUserId(int userId) throws Exception;
}
