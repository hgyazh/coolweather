package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/25 0025.
 * 建立一张表：县，用于存放县的数据信息
 * 本程序使用LitePal来管理天气的数据库，LitePal中的每一个实体类都是必须要继承自DataSupport类的。
 */

public class County extends DataSupport {

    private int id;//每个实体类中都应有的字段
    private String countyName;//记录县的名字
    private String weatherId;//记录县所对应的天气Id
    private int cityId;//记录当前县所属市的id值

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName){
        this.countyName = countyName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
