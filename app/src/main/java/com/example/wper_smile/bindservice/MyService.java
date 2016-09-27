package com.example.wper_smile.bindservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MyService extends Service {
    private static final String TAG="test";
    public MyService() {
    }

    @Override
    public void onCreate() {
        Log.v(TAG,"onCreate()");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.v(TAG,"onStartCommand()");
        int n=intent.getIntExtra("num",0);
        Log.v(TAG,"int is:"+n);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.v(TAG,"onDestroy()");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.v(TAG,"onBind()");
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.v(TAG,"onUnbind()");
        return super.onUnbind(intent);
    }
}
