package com.store.controller;

import com.store.domain.UserInfo;
import com.store.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * @Author Administrator
 * @Date 2018/4/19 0019
 * @Description
 */
@RestController
@RequestMapping("/api/user")
public class UserInfoController {

    private final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Inject
    private UserInfoService userInfoService;

    @RequestMapping(value = "getUserInfo",method = RequestMethod.GET)
    public List<UserInfo> getUserInfo(UserInfo userInfo){
        LOGGER.info("this is userInof = {}",userInfo.toString());
        return userInfoService.getUserInfo(userInfo);
    }
    @RequestMapping(value = "getUserInfoByParam",method = RequestMethod.GET)
    public UserInfo getUserInfoByParam(UserInfo userInfo){
        LOGGER.info("this is userInof = {}",userInfo.toString());
        return userInfoService.getUserInfoByParam(userInfo);
    }
}
