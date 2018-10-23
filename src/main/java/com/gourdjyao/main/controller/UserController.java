package com.gourdjyao.main.controller;

import com.gourdjyao.main.entry.UserInfo;
import com.gourdjyao.main.http.request.LoginRequest;
import com.gourdjyao.main.http.request.RegisterRequest;
import com.gourdjyao.main.http.response.BaseResult;
import com.gourdjyao.main.http.response.LoginResponse;
import com.gourdjyao.main.http.response.LoginResult;
import com.gourdjyao.main.http.response.RegisterResponse;
import com.gourdjyao.main.service.serviceinterface.IUserInfoService;
import com.gourdjyao.main.http.utils.ResultCodeUtils;
import com.gourdjyao.main.http.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.gourdjyao.main.http.utils.ResultUtils.RESPONSE_MESSAGE_MAP;
import static com.gourdjyao.main.http.utils.ResultUtils.RESPONSE_MESSAGE_TYPE_MAP;

@Controller
public class UserController {
    @Autowired
    IUserInfoService userInfoService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    LoginResponse login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        LoginResult loginResult = new LoginResult();
        try {
            UserInfo userInfo = userInfoService.login(loginRequest.getData());
            loginResponse.setVersion(ResultUtils.VERSION_STRING);
            loginResponse.setMessageType(RESPONSE_MESSAGE_TYPE_MAP.get("MSG_LOGIN_REQ"));
            if (userInfo != null) {
                loginResult.setToken(userInfo.getToken());
                loginResult.setResultCode(ResultCodeUtils.SUCCESS_CODE_INT);
                loginResult.setResultMessage(RESPONSE_MESSAGE_MAP.get(ResultCodeUtils.SUCCESS_CODE_INT));
            } else {
                loginResult.setResultCode(ResultCodeUtils.LOGIN_FAILED_CODE_INT);
                loginResult.setResultMessage(RESPONSE_MESSAGE_MAP.get(ResultCodeUtils.LOGIN_FAILED_CODE_INT));
            }
            loginResponse.setData(loginResult);
            return loginResponse;
        } catch (Exception e) {
            loginResult.setResultCode(ResultCodeUtils.LOGIN_FAILED_CODE_INT);
            loginResult.setResultMessage(RESPONSE_MESSAGE_MAP.get(ResultCodeUtils.LOGIN_FAILED_CODE_INT));
            loginResponse.setData(loginResult);
            e.printStackTrace();
            return loginResponse;
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    Map<String,Object> userInfoJson
    public @ResponseBody
    RegisterResponse register(@RequestBody RegisterRequest userInfoRequest) {
//        userInfoService.login(userName, password);
        System.out.println("=====================register========================");
        RegisterResponse registerResponse = new RegisterResponse();
        registerResponse.setVersion(ResultUtils.VERSION_STRING);
        registerResponse.setMessageType(RESPONSE_MESSAGE_TYPE_MAP.get(userInfoRequest.getMessageType()));
        UserInfo userInfo = new UserInfo();
        if (userInfoRequest.getData() != null) {
            userInfo.setUsername(userInfoRequest.getData().getUsername());
            userInfo.setPassword(userInfoRequest.getData().getPassword());
            userInfo.setNickname(userInfoRequest.getData().getNickname());
            userInfo.setSex(userInfoRequest.getData().getSex());
            userInfo.setTelphone(userInfoRequest.getData().getTelphone());
            userInfo.setEmail(userInfoRequest.getData().getEmail());
            try {
                userInfoService.register(userInfo);
                BaseResult baseResult = new BaseResult();
                baseResult.setResultCode(ResultCodeUtils.SUCCESS_CODE_INT);
                baseResult.setResultMessage(RESPONSE_MESSAGE_MAP.get(ResultCodeUtils.SUCCESS_CODE_INT));
                registerResponse.setData(baseResult);
                return registerResponse;
            } catch (Exception e) {
                BaseResult baseResult = new BaseResult();
                baseResult.setResultCode(ResultCodeUtils.REGISTER_FAILED_CODE_INT);
                baseResult.setResultMessage(RESPONSE_MESSAGE_MAP.get(ResultCodeUtils.REGISTER_FAILED_CODE_INT));
                registerResponse.setData(baseResult);
                e.printStackTrace();
                return registerResponse;
            }

        }
        BaseResult baseResult = new BaseResult();
        baseResult.setResultCode(ResultCodeUtils.REGISTER_FAILED_CODE_INT);
        baseResult.setResultMessage(RESPONSE_MESSAGE_MAP.get(ResultCodeUtils.REGISTER_FAILED_CODE_INT));
        registerResponse.setData(baseResult);
        return registerResponse;
    }
}
