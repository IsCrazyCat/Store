package com.store.domain;

import com.store.domain.base.AbstractEntity;
import com.store.domain.base.PageEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @Author guojunguang
 * @Date 2018/4/20 0020
 * @Description
 */

public class StoreInfo extends AbstractEntity{

    private  long id;

    private  String type;

    private  String mobile;

    private  String name;

    private  String address;

    private  String locationX;

    private  String locationY;

    private  String logoUrl;

    private  String logoDetailUrl;

    private  String description;

    private  String tags;

    private  String orderId;

    private  String isOnline;

    public  long  getId(){
        return  this.id;
    };
    public  void  setId(long id){
        this.id=id;
    }

    public  String  getType(){
        return  this.type;
    };
    public  void  setType(String type){
        this.type=type;
    }

    public  String  getMobile(){
        return  this.mobile;
    };
    public  void  setMobile(String mobile){
        this.mobile=mobile;
    }

    public  String  getName(){
        return  this.name;
    };
    public  void  setName(String name){
        this.name=name;
    }

    public  String  getAddress(){
        return  this.address;
    };
    public  void  setAddress(String address){
        this.address=address;
    }

    public  String  getLocationX(){
        return  this.locationX;
    };
    public  void  setLocationX(String locationX){
        this.locationX=locationX;
    }

    public  String  getLocationY(){
        return  this.locationY;
    };
    public  void  setLocationY(String locationY){
        this.locationY=locationY;
    }

    public  String  getLogoUrl(){
        return  this.logoUrl;
    };
    public  void  setLogoUrl(String logoUrl){
        this.logoUrl=logoUrl;
    }

    public  String  getLogoDetailUrl(){
        return  this.logoDetailUrl;
    };
    public  void  setLogoDetailUrl(String logoDetailUrl){
        this.logoDetailUrl=logoDetailUrl;
    }

    public  String  getDescription(){
        return  this.description;
    };
    public  void  setDescription(String description){
        this.description=description;
    }

    public  String  getTags(){
        return  this.tags;
    };
    public  void  setTags(String tags){
        this.tags=tags;
    }

    public  String  getOrderId(){
        return  this.orderId;
    };
    public  void  setOrderId(String orderId){
        this.orderId=orderId;
    }

    public  String  getIsOnline(){
        return  this.isOnline;
    };
    public  void  setIsOnline(String isOnline){
        this.isOnline=isOnline;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
