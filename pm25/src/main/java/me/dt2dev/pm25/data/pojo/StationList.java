package me.dt2dev.pm25.data.pojo;

/**
 * Created by darktiny on 14-1-29.
 */

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class StationList {

    @Expose
    private String city;
    @Expose
    private List<Station> stations = new ArrayList<Station>();

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}