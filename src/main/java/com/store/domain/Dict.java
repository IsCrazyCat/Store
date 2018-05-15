package com.store.domain;

import com.store.domain.base.AbstractEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @Author guojunguang
 * @Date 2018/4/20 0020
 * @Description 数据字典表（之后读取到缓存中）
 */

public class Dict extends AbstractEntity{

    private  long id;

    private  String categoryCode;

    private  String code;

    private  String name;

    private  String shortName;

    private String imageUrl;

    private  String parentId;

    private  String levelType;

    private  String sort;

    private  String remark;

    public  long  getId(){
        return  this.id;
    };
    public  void  setId(long id){
        this.id=id;
    }

    public  String  getCategoryCode(){
        return  this.categoryCode;
    };
    public  void  setCategoryCode(String categoryCode){
        this.categoryCode=categoryCode;
    }

    public  String  getName(){
        return  this.name;
    };
    public  void  setName(String name){
        this.name=name;
    }

    public  String  getShortName(){
        return  this.shortName;
    };
    public  void  setShortName(String shortName){
        this.shortName=shortName;
    }

    public  String  getLevelType(){
        return  this.levelType;
    };
    public  void  setLevelType(String levelType){
        this.levelType=levelType;
    }

    public  String  getRemark(){
        return  this.remark;
    };
    public  void  setRemark(String remark){
        this.remark=remark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }

}
