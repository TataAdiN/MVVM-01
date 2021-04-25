package com.example.myapplication.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.myapplication.model.ClickCount;

public class MainActivityViewModelFactory implements ViewModelProvider.Factory {
    private ClickCount clickCount;

    public MainActivityViewModelFactory(ClickCount clickCount) {
        this.clickCount = clickCount;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(MainActivityViewModel.class)){
            return (T) new MainActivityViewModel(clickCount);
        }
        throw new IllegalArgumentException("Viewmodel Yang Diminta MainActivityViewModel");
    }
}
