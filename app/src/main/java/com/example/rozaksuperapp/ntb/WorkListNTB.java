package com.example.rozaksuperapp.ntb;

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



public class WorkListNTB extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] namesss= new String[ProvNTB.PROV_NTBS.length];
        for (int i = 0; i < namesss.length; i++) {
            namesss[i] = ProvNTB.PROV_NTBS[i].getName();
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