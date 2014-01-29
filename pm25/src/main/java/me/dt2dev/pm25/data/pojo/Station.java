package me.dt2dev.pm25.data.pojo;

/**
 * Created by darktiny on 14-1-29.
 */

import com.google.gson.annotations.Expose;

public class Station {

    @Expose
    private String station_name;
    @Expose
    private String station_code;

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStation_code() {
        return station_code;
    }

    public void setStation_code(String station_code) {
        this.station_code = station_code;
    }

    @Override public String toString() {
        return station_name;
    }
}
