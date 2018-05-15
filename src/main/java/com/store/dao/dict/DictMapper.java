package com.store.dao.dict;

import com.store.domain.Dict;
import com.store.domain.StoreInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author guojunguang
 * @Date 2018/4/23 0023
 * @Description
 */
public interface DictMapper {
    /**
     * 获取数据字典信息
     * @param dict 筛选条件
     * @return Dict
     */
    List<Dict> findDict(Dict dict);

}
