package com.example.androidrealm;

import android.app.Application;

import io.realm.Realm;

public class MyApllication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);

    }
}
