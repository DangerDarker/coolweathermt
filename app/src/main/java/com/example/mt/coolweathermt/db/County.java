package com.example.mt.coolweathermt.db;

import org.litepal.crud.DataSupport;

/**
 * Created by MT on 2018/1/20.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;  //对应天气id
    private int cityID;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }


}
