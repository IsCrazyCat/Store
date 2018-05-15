package com.store.controller;

import com.store.domain.StoreInfo;
import com.store.service.StoreInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @Author guojunguang
 * @Date 2018/5/2 0002
 * @Description
 */
@RestController
@RequestMapping("/api/store")
public class StoreInfoController {

    private final Logger log = LoggerFactory.getLogger(StoreInfoController.class);

    @Inject
    private StoreInfoService storeInfoService;

    @RequestMapping(value = "/findStoreInfo",
                method = {RequestMethod.POST},
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<StoreInfo> findStoreInfo(@RequestBody StoreInfo storeInfo,Pageable pageable){
        System.out.println("page = "+pageable.getPageNumber());
        return storeInfoService.findStoreInfo(storeInfo,pageable);
    }
}
