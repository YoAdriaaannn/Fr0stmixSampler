package com.fr0stsp1re.fr0stmixsampler;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = com.fr0stsp1re.fr0stmixsampler.SongAdapter.class.getSimpleName();




    public SongAdapter(Activity context, ArrayList<Song> songs) {
         super(context, 0, songs);
    }

    // View and inflate
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_alt, parent, false);




            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.default_textview);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentSong.getmSongName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.info2_textview);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentSong.getmAlbumName());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_1);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentSong.getImageResourceId());




        return listItemView;
    }



}