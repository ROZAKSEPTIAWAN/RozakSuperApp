package com.example.rozaksuperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.rozaksuperapp.kalimantan.dashboardKalimantan;
import com.example.rozaksuperapp.lampung.dashboard;
import com.example.rozaksuperapp.ntb.dashboardNTB;

public class ListProvinsi extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_provinsi);

            AdapterView.OnItemClickListener itemClickListener =
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                            if (position==0){
                                Intent intent = new Intent( ListProvinsi.this, dashboard.class);
                                startActivity(intent);
                            }

                            if (position==1){
                                Intent intent = new Intent( ListProvinsi.this, dashboardNTB.class);
                                startActivity(intent);
                            }
                            if (position==2){
                                Intent intent = new Intent( ListProvinsi.this, dashboardKalimantan.class);
                                startActivity(intent);
                            }

                        }
                    };
            listView = (ListView) findViewById(R.id.listview);
            listView.setOnItemClickListener(itemClickListener);

        }

}
