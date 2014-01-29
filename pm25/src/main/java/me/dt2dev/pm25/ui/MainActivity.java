package me.dt2dev.pm25.ui;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import me.dt2dev.pm25.PM25Application;
import me.dt2dev.pm25.R;
import me.dt2dev.pm25.data.PM25Service;
import me.dt2dev.pm25.data.pojo.AQI;
import me.dt2dev.pm25.data.pojo.CityList;
import me.dt2dev.pm25.data.pojo.Station;
import me.dt2dev.pm25.data.pojo.StationList;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.util.functions.Action1;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener {

    String APP_KEY = "5j1znBVAsnSf5xQyNQyq";

    @Inject PM25Service mPM25Service;

    private ArrayAdapter mAdapter;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PM25Application.getContext(this).inject(this);

        initViews();
        initCityList();
    }

    private void initViews() {
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, new ArrayList<String>());
        getListView().setAdapter(mAdapter);
        getListView().setOnItemClickListener(this);
    }

    private void initCityList() {
        mPM25Service.getCityList(APP_KEY)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        new Action1<CityList>() {
                            @Override public void call(CityList list) {
                                mAdapter.clear();
                                mAdapter.addAll(list.getCities());
                            }
                        },
                        new Action1<Throwable>() {
                            @Override public void call(Throwable throwable) {
                                System.out.println(throwable);
                                toast();
                            }
                        }
                );
    }


    @Override public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView text1 = (TextView) view.findViewById(android.R.id.text1);
        if (text1 == null)
            return;

        String city = text1.getText().toString();
        getStationList(city);
    }

    private void getStationList(String city) {
        mPM25Service.getStationListByCity(APP_KEY, city)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        new Action1<StationList>() {
                            @Override public void call(StationList stationList) {
                                initDialog(stationList);
                            }
                        },
                        new Action1<Throwable>() {
                            @Override public void call(Throwable throwable) {
                                System.out.println(throwable);
                                toast();
                            }
                        }
                );
    }

    private void initDialog(final StationList stationList) {
        ListAdapter adapter = new ArrayAdapter<Station>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, stationList.getStations());
        new AlertDialog.Builder(this).setAdapter(adapter, new DialogInterface.OnClickListener() {
            @Override public void onClick(DialogInterface dialogInterface, int i) {
                getAQIReport(stationList.getStations().get(i).getStation_code());
            }
        }).create().show();
    }

    private void getAQIReport(String code) {
        mPM25Service.getAqisByStation(APP_KEY, code)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        new Action1<List<AQI>>() {
                            @Override public void call(List<AQI> list) {
                                if (list != null && list.size() > 0)
                                    initDialog(list.get(0));
                            }
                        },
                        new Action1<Throwable>() {
                            @Override public void call(Throwable throwable) {
                                System.out.println(throwable);
                                toast();
                            }
                        }
                );
    }

    private void initDialog(final AQI aqi) {
        new AlertDialog.Builder(this).setMessage(aqi.toString()).create().show();
    }

    private void toast() {
        Toast.makeText(MainActivity.this, R.string.toast_error, Toast.LENGTH_SHORT).show();
    }
}
