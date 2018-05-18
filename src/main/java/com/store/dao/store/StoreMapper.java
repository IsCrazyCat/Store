package com.store.dao.store;

import com.store.domain.StoreInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author guojunguang
 * @Date 2018/4/23 0023
 * @Description
 */
public interface StoreMapper {
    /**
     * 获取商店信息
     * @param storeInfo 筛选条件
     * @return storeInfo集合
     */
    List<StoreInfo> findStoreInfo(@Param("storeInfo") StoreInfo storeInfo, @Param("page") Pageable pageable);
    /**
     * 获取商店信息數量
     * @param storeInfo 筛选条件
     * @return storeInfo集合
     */
   int findStoreInfoCount(@Param("storeInfo") StoreInfo storeInfo);

    /**
     * 更新商店信息
     * @param storeInfo 筛选条件
     * @return storeInfo集合
     */
    int updateStoreInfo(@Param("storeInfo") StoreInfo storeInfo);
    /**
     * 添加商店信息
     * @param storeInfo 筛选条件
     * @return storeInfo集合
     */
    int addStoreInfo(@Param("storeInfo") StoreInfo storeInfo);

}
