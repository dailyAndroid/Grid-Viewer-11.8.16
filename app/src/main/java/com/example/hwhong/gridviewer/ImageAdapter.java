package com.example.hwhong.gridviewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hwhong on 8/11/16.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private String[] compNames;

    public ImageAdapter(Context c, String[] compNames) {
        mContext = c;
        this.compNames = compNames;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(mContext);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.mobile, null);

            // set value into textview
            TextView textView = (TextView) gridView
                    .findViewById(R.id.textView);
            textView.setText(compNames[position]);

            // set image based on selected text
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.imageView);

            String mobile = compNames[position];

            imageView.setImageResource(mThumbIds[position]);

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.airbnb, R.drawable.amazon, R.drawable.apple, R.drawable.beme,R.drawable.facebook,
            R.drawable.google, R.drawable.hipmunk,  R.drawable.lyft, R.drawable.snapcaht,
            R.drawable.soundcloud, R.drawable.spotify, R.drawable.twitter, R.drawable.uber, R.drawable.yelp
    };
}