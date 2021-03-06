package com.gourdjyao.main.mapper;

import com.gourdjyao.main.entry.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserInfoMapper {
    int insertUser(UserInfo user) throws Exception;

    int updateUser(UserInfo user) throws Exception;

    int deleteUser(int id) throws Exception;

    UserInfo selectUserById(int id) throws Exception;

    List<UserInfo> selectAllUser() throws Exception;

    UserInfo selectUserByUserName(UserInfo userInfo) throws Exception;

    UserInfo selectUserByToken(String token) throws Exception;
}
