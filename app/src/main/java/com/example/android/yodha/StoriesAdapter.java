package com.example.android.yodha;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.yodha.R;

import java.util.List;

public class StoriesAdapter extends ArrayAdapter<com.example.android.yodha.Stories> {

    public StoriesAdapter(@NonNull Context context,  @NonNull List<com.example.android.yodha.Stories> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.stories, parent, false);
        }
        com.example.android.yodha.Stories currentAndroidFlavor = getItem(position);
        TextView mTextView = (TextView) listItemView.findViewById(R.id.text1);

        mTextView.setText(currentAndroidFlavor.getmText());
        TextView mTextView2 = (TextView) listItemView.findViewById(R.id.text2);

        mTextView2.setText(currentAndroidFlavor.getmText2());
        ImageView imageView =(ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentAndroidFlavor.getmImageresourceid());
        return listItemView;

    }
}