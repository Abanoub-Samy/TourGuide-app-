package com.example.bebo.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SetAdapter extends ArrayAdapter<List> {
    ArrayList<List> list;

    public SetAdapter(Context context, int resource, ArrayList<List> list) {
        super(context, 0, list);
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        List item = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView nameText = convertView.findViewById(R.id.info);
        ImageView imageView = convertView.findViewById(R.id.image);
        TextView Name = convertView.findViewById(R.id.name);
        nameText.setText(item.getLocation());
        imageView.setImageResource(item.getImg());
        Name.setText(item.getName());
        return convertView;
    }
}
