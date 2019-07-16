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


public class PublicPlaces extends Fragment {
    public PublicPlaces() {
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
        items.add(new List(getResources().getString(R.string.giza), getResources().getString(R.string.sphinx_name), R.drawable.giza_pyramid_complex, getResources().getString(R.string.sphinx)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.Abdeen_palace), R.drawable.abdeen_palace, getResources().getString(R.string.Abdeen)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.khan_el_khalili), R.drawable.khan_el_khalili_cairo, getResources().getString(R.string.Khan_el)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.pharonic_village), R.drawable.pharonic_village6, getResources().getString(R.string.Pharonic_village)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.cairo_opera_house), R.drawable.cairo_opera_house, getResources().getString(R.string.opera)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.cairo_tower_name), R.drawable.cairo_tower, getResources().getString(R.string.cairo_tower)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.salah_el_din), R.drawable.salah_el_din_a_ayouby_citadel, getResources().getString(R.string.salah)));
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
