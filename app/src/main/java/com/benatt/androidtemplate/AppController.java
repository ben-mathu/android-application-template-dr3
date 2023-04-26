package com.benatt.androidtemplate;

import android.app.Application;

import com.benatt.androidtemplate.di.DaggerMainComponent;
import com.benatt.androidtemplate.di.MainComponent;
import com.benatt.androidtemplate.di.modules.DbModule;

/**
 * @author ben-mathu
 * @date 4/26/23
 */
public class AppController extends Application {

    private MainComponent dagger;

    @Override
    public void onCreate() {
        super.onCreate();

        dagger = DaggerMainComponent.builder()
                .dbModule(new DbModule(this))
                .build();
    }
}
