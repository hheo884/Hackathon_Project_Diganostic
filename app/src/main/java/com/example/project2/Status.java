package com.example.project2;

import android.util.Log;

public class Status {
    private static Status sInstance = new Status();
    private int count;

    private Status(){
        count = 0;
    }

    public static Status getInstance(){
        return sInstance;
    }

    public void increaseCount(int x){
        count+= x;
        Log.d("covid-19", "count: " + count);
    }

    public int getCount(){
        return count;
    }

    public void resetCount(){
        count = 0;
    }
}
