package com.example.rozaksuperapp.kalimantan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.rozaksuperapp.Listener;
import com.example.rozaksuperapp.R;

import com.example.rozaksuperapp.ntb.DetailActNTB;

public class dashboardKalimantan extends AppCompatActivity implements Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_kalimantan);
    }

    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailKalimantan.class);
        intent.putExtra(DetailKalimantan.EXTRA_WORKOUT_ID, (int) id);
        startActivity(intent);
    }
}