package com.example.rozaksuperapp.ntb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rozaksuperapp.R;


public class DetailActNTB extends AppCompatActivity {
    public static final String EXTRA_WORKOUT_ID = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_act_ntb);

        WorkDetailNTB frag = (WorkDetailNTB)
                getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag.setWorkouts(workoutId);
    }
}