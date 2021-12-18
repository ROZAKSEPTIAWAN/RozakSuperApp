package com.example.rozaksuperapp.kalimantan;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.rozaksuperapp.Listener;
import com.example.rozaksuperapp.R;
import com.example.rozaksuperapp.ntb.ProvNTB;


public class WorkListKalimantan extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] namesss= new String[ProvKalimantan.PROV_KALIMANTANS.length];
        for (int i = 0; i < namesss.length; i++) {
            namesss[i] = ProvKalimantan.PROV_KALIMANTANS[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, namesss);

        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    private Listener listeners;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listeners = (Listener)context;
    }

    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        if (listeners != null) {
            listeners.itemClicked(id);
        }
    }

}