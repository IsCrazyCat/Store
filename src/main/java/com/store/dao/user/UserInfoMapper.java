package com.store.dao.user;

import com.store.domain.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2018/4/19 0019
 * @Description
 */
public interface UserInfoMapper {
    List<UserInfo> getUserInfo(UserInfo userInfo);
    UserInfo getUserInfoByParam(UserInfo userInfo);
}
