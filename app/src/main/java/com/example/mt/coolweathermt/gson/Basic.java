package com.example.mt.coolweathermt.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MT on 2018/1/21.
 */

public class Basic {
    //使用@SerializedName 来让 JSON 与 Java之间建立映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
