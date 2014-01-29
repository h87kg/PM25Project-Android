package me.dt2dev.pm25;

import android.app.Application;
import android.content.Context;

import dagger.ObjectGraph;

/**
 * Created by darktiny on 14-1-29.
 */
public class PM25Application extends Application {

    private ObjectGraph mObjectGraph;

    @Override public void onCreate() {
        super.onCreate();
        initObjectGraph();
    }

    private void initObjectGraph() {
        mObjectGraph = ObjectGraph.create(new PM25Module());
    }

    public void inject(Object object) {
        mObjectGraph.inject(object);
    }

    public static PM25Application getContext(Context context) {
        return (PM25Application) context.getApplicationContext();
    }
}
