package com.example.myapplication.view;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.model.ClickCount;
import com.example.myapplication.viewmodel.MainActivityViewModel;
import com.example.myapplication.viewmodel.MainActivityViewModelFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MainActivityViewModel mainActivityViewModel;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityViewModelFactory mainActivityViewModelFactory = new MainActivityViewModelFactory(new ClickCount(10));
        mainActivityViewModel = new ViewModelProvider(this, mainActivityViewModelFactory).get(MainActivityViewModel.class);

        activityMainBinding.setViewModel(mainActivityViewModel);
        activityMainBinding.txtPushupCount.setText(String.valueOf(mainActivityViewModel.getPushup()));
        activityMainBinding.setLifecycleOwner(this);
        activityMainBinding.btnPushup.setOnClickListener(this);
        setContentView(activityMainBinding.getRoot());
    }

    @Override
    public void onClick(View view) {
        mainActivityViewModel.doPushup();
        activityMainBinding.txtPushupCount.setText(String.valueOf(mainActivityViewModel.getPushup()));
    }
}