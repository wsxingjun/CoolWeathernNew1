package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017-09-22.
 */

public class Province extends DataSupport{
    private int id;
    private String privinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getPrivinceName(){
        return privinceName;
    }
    public void setPrivinceName(String privinceName){
        this.privinceName = privinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
