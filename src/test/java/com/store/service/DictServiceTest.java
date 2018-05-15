package com.store.service;

import com.alibaba.fastjson.JSON;
import com.store.Application;
import com.store.domain.Dict;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.inject.Inject;
import java.util.List;

/**
 * @Author guojunguang
 * @Date 2018/5/3 0003
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
@ActiveProfiles("dev")
public class DictServiceTest {

    @Inject
    private DictService dictService;

    @Test
    public void findDict(){
        Dict dict = new Dict();
        dict.setCategoryCode("showIndex");
        List<Dict> dicts = dictService.findDict(dict);
        for(Dict dict1:dicts){
            System.out.println(JSON.toJSONString(dict1));
        }
    }
}
