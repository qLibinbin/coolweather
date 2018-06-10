package com.example.coolweather.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PC on 2018/6/4.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
