package com.store.service.impl;

import com.store.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Author Administrator
 * @Date 2018/4/18 0018
 * @Description
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test(){
        return "success";
    }
}
