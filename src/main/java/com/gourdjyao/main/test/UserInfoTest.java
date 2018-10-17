package com.gourdjyao.main.test;

import com.gourdjyao.main.service.UserInfoService;
import com.gourdjyao.main.service.serviceinterface.IUserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml", "classpath:applicationContext-service.xml", "classpath:applicationContext-tx.xml"})

public class UserInfoTest {
    @Resource
    IUserInfoService userInfoService;

    @Test
    public void testAdd() throws Exception {
        userInfoService.login("yaojian", "yaojian");
    }
}
