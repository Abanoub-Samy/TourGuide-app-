package com.example.bebo.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class First_Fragment extends Fragment {
    public First_Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<List> items = new ArrayList<>();
        items.add(new List(getResources().getString(R.string.egy), getResources().getString(R.string.about), R.drawable.egypt, getResources().getString(R.string.egyptdes)));
        ListView listView = view.findViewById(R.id.listview);
        SetAdapter set = new SetAdapter(getContext(), 0, items);

        listView.setAdapter(set);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                List current = items.get(i);
                Intent intent = new Intent(getContext(), Info_Iay.class);

                intent.putExtra(getResources().getString(R.string.name), current.getName());
                intent.putExtra(getResources().getString(R.string.location), current.getLocation());
                intent.putExtra(getResources().getString(R.string.description), current.info);
                intent.putExtra(getResources().getString(R.string.imageResourse), current.getImg());
                startActivity(intent);
            }
        });

        return view;
    }
}
