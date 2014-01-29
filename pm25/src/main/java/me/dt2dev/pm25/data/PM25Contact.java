package me.dt2dev.pm25.data;

/**
 * Created by darktiny on 14-1-29.
 */
public class PM25Contact {

    static final String BASE_URL = "http://www.pm25.in/api";

    interface Api {
        String CITES = "/querys.json";
        String STATIONS_BY_CITY = "/querys/station_names.json";
        String AQIS_BY_STATION = "/querys/aqis_by_station.json";
    }
}
