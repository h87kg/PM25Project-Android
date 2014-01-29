package me.dt2dev.pm25.data.pojo;

/**
 * Created by darktiny on 14-1-29.
 */

import com.google.gson.annotations.Expose;

public class AQI {

    @Expose
    private Double aqi;
    @Expose
    private String area;
    @Expose
    private Double co;
    @Expose
    private Double co_24h;
    @Expose
    private Double no2;
    @Expose
    private Double no2_24h;
    @Expose
    private Double o3;
    @Expose
    private Double o3_24h;
    @Expose
    private Double o3_8h;
    @Expose
    private Double o3_8h_24h;
    @Expose
    private Double pm10;
    @Expose
    private Double pm10_24h;
    @Expose
    private Double pm2_5;
    @Expose
    private Double pm2_5_24h;
    @Expose
    private String position_name;
    @Expose
    private String primary_pollutant;
    @Expose
    private String quality;
    @Expose
    private Double so2;
    @Expose
    private Double so2_24h;
    @Expose
    private String station_code;
    @Expose
    private String time_point;

    public Double getAqi() {
        return aqi;
    }

    public void setAqi(Double aqi) {
        this.aqi = aqi;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getCo_24h() {
        return co_24h;
    }

    public void setCo_24h(Double co_24h) {
        this.co_24h = co_24h;
    }

    public Double getNo2() {
        return no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getNo2_24h() {
        return no2_24h;
    }

    public void setNo2_24h(Double no2_24h) {
        this.no2_24h = no2_24h;
    }

    public Double getO3() {
        return o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Double getO3_24h() {
        return o3_24h;
    }

    public void setO3_24h(Double o3_24h) {
        this.o3_24h = o3_24h;
    }

    public Double getO3_8h() {
        return o3_8h;
    }

    public void setO3_8h(Double o3_8h) {
        this.o3_8h = o3_8h;
    }

    public Double getO3_8h_24h() {
        return o3_8h_24h;
    }

    public void setO3_8h_24h(Double o3_8h_24h) {
        this.o3_8h_24h = o3_8h_24h;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getPm10_24h() {
        return pm10_24h;
    }

    public void setPm10_24h(Double pm10_24h) {
        this.pm10_24h = pm10_24h;
    }

    public Double getPm2_5() {
        return pm2_5;
    }

    public void setPm2_5(Double pm2_5) {
        this.pm2_5 = pm2_5;
    }

    public Double getPm2_5_24h() {
        return pm2_5_24h;
    }

    public void setPm2_5_24h(Double pm2_5_24h) {
        this.pm2_5_24h = pm2_5_24h;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public String getPrimary_pollutant() {
        return primary_pollutant;
    }

    public void setPrimary_pollutant(String primary_pollutant) {
        this.primary_pollutant = primary_pollutant;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getSo2_24h() {
        return so2_24h;
    }

    public void setSo2_24h(Double so2_24h) {
        this.so2_24h = so2_24h;
    }

    public String getStation_code() {
        return station_code;
    }

    public void setStation_code(String station_code) {
        this.station_code = station_code;
    }

    public String getTime_point() {
        return time_point;
    }

    public void setTime_point(String time_point) {
        this.time_point = time_point;
    }

    @Override public String toString() {
        return "aqi=" + aqi +
                ", area=" + area +
                ", pm2_5=" + pm2_5 +
                ", pm2_5_24h=" + pm2_5_24h +
                ", quality=" + quality +
                ", position_name=" + position_name +
                ", time_point=" + time_point;
    }
}
