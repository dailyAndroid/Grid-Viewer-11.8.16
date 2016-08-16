package com.example.hwhong.gridviewer;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private ArrayAdapter<String> adapter;
    private String[] compList = {"Airbnb", "Amazon", "Apple", "Beme", "Facebook", "Google", "Hipmunk",
    "Lyft", "Snapchat", "Soundcloud", "Spotify", "Twitter", "Uber", "Yelp"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridview);

        gridView.setAdapter(new ImageAdapter(getApplicationContext(), compList));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
                Intent intent = new Intent(getApplicationContext(), Information.class);

                intent.putExtra("position", position);

                startActivity(intent);
            }
        });
    }
}
