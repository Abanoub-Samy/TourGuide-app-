package com.example.bebo.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Info_Iay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_lay);
        ImageView imageView = findViewById(R.id.image2);
        TextView nameText = findViewById(R.id.name2);
        TextView descText = findViewById(R.id.descrption);


        Intent intent = getIntent();
        String name = intent.getStringExtra(getResources().getString(R.string.name));
        String description = intent.getStringExtra(getResources().getString(R.string.description));
        int imageResourse = intent.getIntExtra(getResources().getString(R.string.imageResourse), 0);

        imageView.setImageResource(imageResourse);
        descText.setText(description);
        nameText.setText(name);

    }
}
