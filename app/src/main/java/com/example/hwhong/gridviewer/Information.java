package com.example.hwhong.gridviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hwhong on 8/11/16.
 */
public class Information extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    private int[] images = {R.drawable.airbnb, R.drawable.amazon, R.drawable.apple, R.drawable.beme,R.drawable.facebook,
    R.drawable.google, R.drawable.hipmunk,  R.drawable.lyft, R.drawable.snapcaht,
    R.drawable.soundcloud, R.drawable.spotify, R.drawable.twitter, R.drawable.uber, R.drawable.yelp};

    private String[] names = {"Airbnb", "Amazon", "Apple", "Beme", "Facebook", "Google", "Hipmunk",
            "Lyft", "Snapchat", "Soundcloud", "Spotify", "Twitter", "Uber", "Yelp"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);

        imageView = (ImageView) findViewById(R.id.imageTV);
        textView = (TextView) findViewById(R.id.infoTV);

        Intent intent = getIntent();

        int position = intent.getIntExtra("position", 0);

        imageView.setImageResource(images[position]);
        textView.setText(names[position]);
    }
}
