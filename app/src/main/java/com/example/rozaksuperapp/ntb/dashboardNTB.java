package com.example.rozaksuperapp.ntb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.rozaksuperapp.Listener;
import com.example.rozaksuperapp.R;


public class dashboardNTB extends AppCompatActivity implements Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_ntb);
    }


    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailActNTB.class);
        intent.putExtra(DetailActNTB.EXTRA_WORKOUT_ID, (int) id);
        startActivity(intent);
    }
}