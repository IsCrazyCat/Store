package com.store.service;

import com.store.domain.UserInfo;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2018/4/19 0019
 * @Description
 */
public interface UserInfoService {
    List<UserInfo> getUserInfo(UserInfo userInfo);
    UserInfo getUserInfoByParam(UserInfo userInfo);
}
