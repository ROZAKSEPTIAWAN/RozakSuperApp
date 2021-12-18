package com.example.rozaksuperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view){
        Intent intent = new Intent(MainActivity.this,ListProvinsi.class);
        startActivity(intent);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"App on Start", Toast.LENGTH_LONG).show();
    }



    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"App on destroy",Toast.LENGTH_LONG).show();
    }

}
