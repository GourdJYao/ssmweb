package com.gourdjyao.main.controller;

import com.gourdjyao.main.entry.BusLineInfo;
import com.gourdjyao.main.http.request.BaseRequest;
import com.gourdjyao.main.http.request.BusLineInfoRequest;
import com.gourdjyao.main.http.response.*;
import com.gourdjyao.main.http.utils.ResultCodeUtils;
import com.gourdjyao.main.service.serviceinterface.IBusLineInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.gourdjyao.main.http.utils.ResultUtils.RESPONSE_MESSAGE_MAP;

@Controller(value = "/bus")
public class BuslineController {
    @Autowired
    IBusLineInfoService busLineInfoService;

    @RequestMapping(value = "/savebuslineinfo", method = RequestMethod.POST)
    public @ResponseBody
    BusLineResponse savebuslineinfo(@RequestBody BusLineInfoRequest busLineInfoRequest) {
        BusLineResponse baseResponse = new BusLineResponse();
        try{
            BusLineInfo busLineInfo = busLineInfoRequest.getData();
            if(busLineInfo!=null){
                busLineInfoService.saveBuslineInfo(busLineInfo);
                BaseResult baseResult = new BaseResult();
                baseResult.setResultCode(ResultCodeUtils.SUCCESS_CODE_INT);
                baseResult.setResultMessage(RESPONSE_MESSAGE_MAP.get(ResultCodeUtils.SUCCESS_CODE_INT));
                baseResponse.setData(baseResult);
                return baseResponse;
            }
        }catch (Exception e){
            BaseResult baseResult = new BaseResult();
            baseResult.setResultCode(ResultCodeUtils.SAVEBUSLINE_FAILED_CODE_INT);
            baseResult.setResultMessage(RESPONSE_MESSAGE_MAP.get(ResultCodeUtils.SAVEBUSLINE_FAILED_CODE_INT));
            baseResponse.setData(baseResult);
            return baseResponse;
        }
        BaseResult baseResult = new BaseResult();
        baseResult.setResultCode(ResultCodeUtils.SAVEBUSLINE_FAILED_CODE_INT);
        baseResult.setResultMessage(RESPONSE_MESSAGE_MAP.get(ResultCodeUtils.SAVEBUSLINE_FAILED_CODE_INT));
        baseResponse.setData(baseResult);
        return baseResponse;
    }
}
