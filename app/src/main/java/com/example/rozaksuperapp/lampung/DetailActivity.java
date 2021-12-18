package com.example.rozaksuperapp.lampung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rozaksuperapp.R;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_WORKOUT_ID = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        WorkDetailFragment frag = (WorkDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag.setWorkout(workoutId);
    }
}