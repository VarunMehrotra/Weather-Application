package com.example.varunmehrotra.weatherapplication;

/**
 * Created by varunmehrotra on 12/16/17.
 */
import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity(){
        return prefs.getString("city", "Sydney, AU");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
