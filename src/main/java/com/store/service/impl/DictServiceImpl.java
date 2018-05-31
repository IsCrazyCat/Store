package com.store.service.impl;

import com.store.dao.dict.DictMapper;
import com.store.domain.Dict;
import com.store.service.DictService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @Author guojunguang
 * @Date 2018/5/3 0003
 * @Description
 */
@Service
public class DictServiceImpl implements DictService{

    private final Logger LOGGER = LoggerFactory.getLogger(DictServiceImpl.class);

    @Inject
    private DictMapper dictMapper;

    @Override
    public List<Dict> findDict(Dict dict){
        return dictMapper.findDict(dict);
    }
    @Override
    public int updateDictInfo(Dict dict){
        return dictMapper.updateDictInfo(dict);
    }

}
