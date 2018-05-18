package com.store.service.impl;

import com.alibaba.fastjson.JSON;
import com.store.dao.store.StoreMapper;
import com.store.domain.StoreInfo;
import com.store.service.StoreInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @Author guojunguang
 * @Date 2018/4/24 0024
 * @Description
 */
@Service
public class StoreInfoServiceImpl implements StoreInfoService{

    private  final Logger LOGGER = LoggerFactory.getLogger(StoreInfoServiceImpl.class);

    @Inject
    private StoreMapper storeMapper;

    public Page<StoreInfo> findStoreInfo(StoreInfo storeInfo, Pageable pageable){
        System.out.println(JSON.toJSONString(pageable.getSort()));
        List<StoreInfo> list = storeMapper.findStoreInfo(storeInfo,pageable);

        return new PageImpl<StoreInfo>(list,pageable,storeMapper.findStoreInfoCount(storeInfo));
    }

    @Override
    public boolean updateStoreInfo(StoreInfo storeInfo) {
        if(storeMapper.updateStoreInfo(storeInfo)>=1){
            return true;
        }
        return false;
    }

    @Override
    public boolean addStoreInfo(StoreInfo storeInfo) {
        if(storeMapper.addStoreInfo(storeInfo)>=1){
            return true;
        }
        return false;
    }

}
