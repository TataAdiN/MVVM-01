package com.example.myapplication.viewmodel;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.myapplication.model.PushupCount;

public class MainActivityViewModel extends ViewModel {

    public PushupCount pushupCount;

    public MainActivityViewModel(PushupCount pushupCount) {
        this.pushupCount = pushupCount;
    }

    public void doPushup(){
        this.pushupCount.setCount(this.pushupCount.getCount()+1);
        Log.d("Pushup Count", String.valueOf(this.getPushup()));
    }

    public int getPushup(){
        return this.pushupCount.getCount();
    }
}
