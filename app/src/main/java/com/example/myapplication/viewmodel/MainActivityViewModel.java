package com.example.myapplication.viewmodel;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.myapplication.model.ClickCount;

public class MainActivityViewModel extends ViewModel {

    public ClickCount clickCount;

    public MainActivityViewModel(ClickCount clickCount) {
        this.clickCount = clickCount;
    }

    public void doPushup(){
        this.clickCount.setCount(this.clickCount.getCount()+1);
        Log.d("Pushup Count", String.valueOf(this.getPushup()));
    }

    public int getPushup(){
        return this.clickCount.getCount();
    }
}
