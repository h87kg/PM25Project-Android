package me.dt2dev.pm25.data.pojo;

/**
 * Created by darktiny on 14-1-29.
 */

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class CityList {

    @Expose
    private List<String> cities = new ArrayList<String>();

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

}