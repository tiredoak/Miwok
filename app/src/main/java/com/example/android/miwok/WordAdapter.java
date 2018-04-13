package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter {
    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        /*
        * We initialise the storage for the context and the list.
        * The second argument is used to populate a single TextView
        * Since we are creating our own TextView, the second argument (resource)
        * is not used so it can be anything (here we use 0).
        */
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /*
        * Check if the view is null (can be if no views have been created yet).
        * If so, we must inflate a new view.
        */
        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        // Find the current Word object
        Word currentWord = (Word) getItem(position);

        // Find the default translation TextView and set its value
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        // Find the miwok translation TextView and set its value
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentWord.getmImageResourceId());

        return listItemView;
    }
}
