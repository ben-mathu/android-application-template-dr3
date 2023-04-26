package com.benatt.androidtemplate.di.modules;

import android.app.Application;

import androidx.room.Room;

import com.benatt.androidtemplate.data.AppDatabase;

import dagger.Module;
import dagger.Provides;

/**
 * @author ben-mathu
 * @date 4/26/23
 */
@Module
public class DbModule {

    private final Application application;

    public DbModule(Application application) {
        this.application = application;
    }

    @Provides
    public AppDatabase provideDatabase() {
        return Room.databaseBuilder(this.application, AppDatabase.class, "example.db")
                .build();
    }
}
