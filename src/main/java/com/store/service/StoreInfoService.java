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

    Page<StoreInfo> findStoreInfoPage(StoreInfo storeInfo, Pageable pageable);

    StoreInfo findStoreInfo(StoreInfo storeInfo);

    boolean updateStoreInfo(StoreInfo storeInfo);

    boolean addStoreInfo(StoreInfo storeInfo);
}
