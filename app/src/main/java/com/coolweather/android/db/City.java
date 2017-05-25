package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/25 0025.
 * 建立一张表：市，用于存放市的数据信息
 * 本程序使用LitePal来管理天气的数据库，LitePal中的每一个实体类都是必须要继承自DataSupport类的。
 */

public class City extends DataSupport {

    private int id;//每个实体类中都应有的字段
    private String cityName;//记录市的名字
    private int cityCode;//记录市的代号
    private int provinceId;//记录当前市所属省的id值

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
