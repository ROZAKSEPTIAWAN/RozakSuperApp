package com.example.rozaksuperapp.lampung;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;

import android.widget.ArrayAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.rozaksuperapp.Listener;

public class WorkListFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[ProvLampung.PROV_LAMPUNGS.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = ProvLampung.PROV_LAMPUNGS[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);

        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }



    private Listener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener)context;
    }

    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}