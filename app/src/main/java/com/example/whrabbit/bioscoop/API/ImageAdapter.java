package com.example.whrabbit.bioscoop.API;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.whrabbit.bioscoop.R;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
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

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(100, 100));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(1, 1, 1, 1);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
            R.drawable.seat_sale, R.drawable.seat_sale,
    };
}