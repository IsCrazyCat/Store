package com.store.service.impl;

import com.store.dao.user.UserInfoMapper;
import com.store.domain.UserInfo;
import com.store.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @Author Administrator
 * @Date 2018/4/19 0019
 * @Description
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Inject
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfo(UserInfo userInfo) {
        return userInfoMapper.getUserInfo(userInfo);
    }

    @Override
    public UserInfo getUserInfoByParam(UserInfo userInfo) {
        return userInfoMapper.getUserInfoByParam(userInfo);
    }
}
