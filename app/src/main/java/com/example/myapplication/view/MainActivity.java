package com.example.myapplication.view;

import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.model.PushupCount;
import com.example.myapplication.viewmodel.MainActivityViewModel;
import com.example.myapplication.viewmodel.MainActivityViewModelFactory;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel mainActivityViewModel;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityViewModelFactory mainActivityViewModelFactory = new MainActivityViewModelFactory(new PushupCount(10));
        mainActivityViewModel = new ViewModelProvider(this, mainActivityViewModelFactory).get(MainActivityViewModel.class);

        activityMainBinding.setViewModel(mainActivityViewModel);
        setContentView(activityMainBinding.getRoot());
    }
}