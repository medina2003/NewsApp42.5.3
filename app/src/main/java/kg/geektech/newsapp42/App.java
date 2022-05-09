package kg.geektech.newsapp42;

import android.app.Application;

import androidx.room.Room;

import room.AppDatabase;

public class App extends Application {
    private static AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = Room.databaseBuilder(this,AppDatabase.class,"nyDatabase")
             .allowMainThreadQueries()
                .build();

    }
    public static AppDatabase getDatabase(){
        return database;
    }
}
