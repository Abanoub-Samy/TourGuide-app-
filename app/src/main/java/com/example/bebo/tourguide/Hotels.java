package com.example.bebo.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class Hotels extends Fragment {
    public Hotels() {
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
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.cairo_apartments), R.drawable.cairo_apartments, getResources().getString(R.string.hotel1)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.downtown_hotels), R.drawable.cairo_downtown_hotels, getResources().getString(R.string.hotel2)));
        items.add(new List(getResources().getString(R.string.giza), getResources().getString(R.string.cairo_hotels_giza), R.drawable.cairo_hotels_giza, getResources().getString(R.string.hotel3)));
        items.add(new List(getResources().getString(R.string.giza), getResources().getString(R.string.pyramids_street), R.drawable.cairo_pyramids_street_hotels, getResources().getString(R.string.hotel4)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.resorts_hotels), R.drawable.cairo_resorts, getResources().getString(R.string.hotel5)));
        items.add(new List(getResources().getString(R.string.zamalek), getResources().getString(R.string.zamalek_hotels), R.drawable.cairo_zamalek_hotels, getResources().getString(R.string.hotel6)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.three_stars_hotels), R.drawable.three_stars_cairo_hotels, getResources().getString(R.string.hotel7)));
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
