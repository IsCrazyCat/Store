package com.store.controller;

import com.store.config.ProjectProperties;
import com.store.domain.StoreInfo;
import com.store.service.StoreInfoService;
import com.store.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @Author Administrator
 * @Date 2018/4/17 0017
 * @Description
 */
@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Inject
    private ProjectProperties projectProperties;

    @Inject
    private TestService testService;

    @Inject
    private StoreInfoService storeInfoService;

    @RequestMapping("/applicationName")
    public String getApplicationName(){
        logger.info("=====这里是日志");
        logger.info(projectProperties.getConfig().getName());
        return projectProperties.getApplicationName();
    }
    @RequestMapping("/test")
    public String ttest(){
        return testService.test();
    }

    @RequestMapping(value = "/findStoreInfo",method = {RequestMethod.GET,RequestMethod.POST})
    public StoreInfo findStoreInfo(StoreInfo storeInfo, Pageable pageable){
        return storeInfoService.findStoreInfo(storeInfo);
    }
}
