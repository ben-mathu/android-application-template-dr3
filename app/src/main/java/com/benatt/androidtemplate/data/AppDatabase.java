package com.benatt.androidtemplate.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.benatt.androidtemplate.data.models.Example;

/**
 * @author ben-mathu
 * @date 4/26/23
 */
@Database(entities = {Example.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
}
