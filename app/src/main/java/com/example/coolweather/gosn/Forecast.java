package com.example.coolweather.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PC on 2018/6/4.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Tempterature tempterature;

    @SerializedName("cond")
    public More more;

    public class Tempterature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
