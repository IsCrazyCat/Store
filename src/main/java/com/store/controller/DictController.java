package com.store.controller;

import com.store.domain.Dict;
import com.store.service.DictService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * @Author guojunguang
 * @Date 2018/5/2 0002
 * @Description
 */
@RequestMapping("/api/dict")
@RestController
public class DictController {

    private final Logger log = LoggerFactory.getLogger(DictController.class);

    @Inject
    private DictService dictService;

    @RequestMapping(value = "/findDict",method = {RequestMethod.POST})
    public List<Dict> findDict(@RequestBody Dict dict){
        return dictService.findDict(dict);
    }
}
