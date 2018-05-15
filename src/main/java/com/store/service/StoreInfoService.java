package com.store.service;

import com.store.domain.StoreInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Author guojunguang
 * @Date 2018/4/24 0024
 * @Description
 */
public interface StoreInfoService {

    public Page<StoreInfo> findStoreInfo(StoreInfo storeInfo, Pageable pageable);
}
