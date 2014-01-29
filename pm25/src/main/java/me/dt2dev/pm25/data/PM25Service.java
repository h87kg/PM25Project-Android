package me.dt2dev.pm25.data;

import java.util.List;

import me.dt2dev.pm25.data.pojo.AQI;
import me.dt2dev.pm25.data.pojo.CityList;
import me.dt2dev.pm25.data.pojo.StationList;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

import static me.dt2dev.pm25.data.PM25Contact.Api;

/**
 * Created by darktiny on 14-1-29.
 */
public interface PM25Service {

    @GET(Api.CITES) Observable<CityList> getCityList(@Query("token") String token);

    @GET(Api.STATIONS_BY_CITY) Observable<StationList> getStationListByCity(@Query("token") String token, @Query("city") String city);

    @GET(Api.AQIS_BY_STATION) Observable<List<AQI>> getAqisByStation(@Query("token") String token, @Query("station_code") String code);
}
