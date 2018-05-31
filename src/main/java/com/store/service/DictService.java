package com.store.service;

import com.store.domain.Dict;

import java.util.List;

/**
 * @Author guojunguang
 * @Date 2018/5/3 0003
 * @Description
 */
public interface DictService {

    List<Dict> findDict(Dict dict);

    int updateDictInfo(Dict dict);
}
