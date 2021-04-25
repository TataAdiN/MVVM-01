package com.example.myapplication.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.myapplication.model.PushupCount;

public class MainActivityViewModelFactory implements ViewModelProvider.Factory {
    private PushupCount pushupCount;

    public MainActivityViewModelFactory(PushupCount pushupCount) {
        this.pushupCount = pushupCount;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(MainActivityViewModel.class)){
            return (T) new MainActivityViewModel(pushupCount);
        }
        throw new IllegalArgumentException("Viewmodel Yang Diminta MainActivityViewModel");
    }
}
