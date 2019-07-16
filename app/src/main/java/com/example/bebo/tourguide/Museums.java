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


public class Museums extends Fragment {
    public Museums() {
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
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.coptic_museum), R.drawable.coptic_museum1, getResources().getString(R.string.coptic)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.egyptian_museum), R.drawable.egyptian_museum_cairo, getResources().getString(R.string.egypt)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.umm_kulthum_museum), R.drawable.umm_kulthum_museum, getResources().getString(R.string.om)));
        items.add(new List(getResources().getString(R.string.cairo), getResources().getString(R.string.mummification_museum), R.drawable.pharonic_village6, getResources().getString(R.string.mummification)));
        items.add(new List(getResources().getString(R.string.alex), getResources().getString(R.string.Alex_museum_name), R.drawable.cairo_opera_house, getResources().getString(R.string.Alex_museum)));
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
