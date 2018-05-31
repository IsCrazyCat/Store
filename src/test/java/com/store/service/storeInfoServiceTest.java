package com.store.service;

import com.alibaba.fastjson.JSON;
import com.store.Application;
import com.store.controller.StoreInfoController;
import com.store.domain.StoreInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.inject.Inject;
import java.util.List;

/**
 * @Author guojunguang
 * @Date 2018/4/24 0024
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
@ActiveProfiles("dev")
public class storeInfoServiceTest {

    @Inject
    private StoreInfoService storeInfoService;
    @Inject
    private StoreInfoController storeInfoController;

    @Test
    public void findStoreInfo() throws Exception {
        int page=1,size=3;
//        Pageable pageable = new PageRequest(page, size);
        Pageable pageable =new PageRequest(3, 2);
        StoreInfo storeInfo = new StoreInfo();
//        storeInfo.setType("1");
        System.out.println(pageable.getOffset());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getPageSize());
        Page<StoreInfo> pages = storeInfoService.findStoreInfoPage(storeInfo,pageable);

        for (StoreInfo storeInfo1:pages) {
            System.out.println(JSON.toJSONString(storeInfo1));
        }

    }
    @Test
    public void findStoreInfo1() throws Exception {

        int page=1,size=3;
//        Pageable pageable = new PageRequest(page, size);
        Pageable pageable =new PageRequest(3, 2);
        StoreInfo storeInfo = new StoreInfo();
//        storeInfo.setType("1");
        System.out.println(pageable.getOffset());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getPageSize());
        Page<StoreInfo> pages = storeInfoController.findStoreInfo(storeInfo,pageable);

        for (StoreInfo storeInfo1:pages) {
            System.out.println(JSON.toJSONString(storeInfo1));
        }
    }
}
