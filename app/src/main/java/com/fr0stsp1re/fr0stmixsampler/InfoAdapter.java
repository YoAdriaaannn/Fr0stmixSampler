/*
 * Copyright (c) 2018.  Adrian Raff AKA Fr0stsp1re
 * ************PROJECT LICENSE*************
 *
 * This project was submitted by Adrian Raff as part of the  Android Basics Nanodegree At Udacity.
 *
 * The Udacity Honor code requires your submissions must be your own work.
 * Submitting this project as yours will cause you to break the Udacity Honor Code
 * and may result in disiplinary action.
 *
 * The author of this project allows you to check the code as a reference only. You may not submit this project or any part
 * of the code as your own.
 *
 * Besides the above notice, the following license applies and this license notice
 * must be included in all works derived from this project.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.fr0stsp1re.fr0stmixsampler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;


public class InfoAdapter extends ArrayAdapter<Info> {

    /** Resource ID for the background color */
    // private int mColorResourceId;

    private final OnItemClickListener listener;

    /**
     * Create a new {@link InfoAdapter} object.
     */
    public InfoAdapter(Context context, ArrayList<Info> infos) {
        super(context, 0, infos);
        // mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_alt, parent, false);
        }


        // Get the {@link Info} object located at this position in the list
        Info currentInfo = getItem(position);

        // Find the TextView in the list_item.xml layout
        TextView info2TextView = (TextView) listItemView.findViewById(R.id.info2_textview);

        info2TextView.setText(currentInfo.getmSecondInfo());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textview);

        defaultTextView.setText(currentInfo.getmDefaultInfo());


        /**
         // Find the ImageView in the list_item.xml layout with the ID image.
         ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
         // Check if an image is provided for this word or not
         if (currentWord.hasImage()) {
         // If an image is available, display the provided image based on the resource ID
         imageView.setImageResource(currentWord.getImageResourceId());
         // Make sure the view is visible
         imageView.setVisibility(View.VISIBLE);
         } else {
         // Otherwise hide the ImageView (set visibility to GONE)
         imageView.setVisibility(View.GONE);
         }


         **/

        // Set the theme color for the list item
        //View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        // int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        // textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            image = (ImageView) itemView.findViewById(R.id.image);
        }

        public void bind(final ContentItem item, final OnItemClickListener listener) {
            name.setText(item.name);
            Picasso.with(itemView.getContext()).load(item.imageUrl).into(image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}