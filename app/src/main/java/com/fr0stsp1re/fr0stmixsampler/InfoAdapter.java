package com.fr0stsp1re.fr0stmixsampler;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fr0stsp1re.fr0stmixsampler.R;

import java.util.ArrayList;

/*
 * {@link InfoAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link AndroidFlavor} objects.
 * */
public class InfoAdapter extends ArrayAdapter<Info> {

    private static final String LOG_TAG = com.fr0stsp1re.fr0stmixsampler.InfoAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param infos   A List of AndroidFlavor objects to display in a list
     */
    public InfoAdapter(Activity context, ArrayList<Info> infos) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, infos);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_alt, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Info currentInfo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView info1 = (TextView) listItemView.findViewById(R.id.default_textview);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        info1.setText(currentInfo.getmDefaultInfo());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView info2 = (TextView) listItemView.findViewById(R.id.info2_textview);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        info2.setText(currentInfo.getmSecondInfo());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView info3 = (TextView) listItemView.findViewById(R.id.info3_textview);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        info3.setText(currentInfo.getmThirdInfo());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_1);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentInfo.getImageResourceId());




                // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView




            return listItemView;





        }

    }
