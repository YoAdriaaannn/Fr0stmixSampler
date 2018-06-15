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

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    // Creates keys for ListView item data

    public static final String ID_SONG = "SONG";

    public static final String ID_ALBUM = "ALBUM";

    public static final int ID_ART = R.drawable.baseline_open_in_new_black_18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        // Create an array list and populate it
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Alien Caravan", "Portland Oregon", R.drawable.baseline_open_in_new_black_18));
        songs.add(new Song("Planet Of Pleasure", "Seattle Washington", R.drawable.baseline_open_in_new_black_18));
        songs.add(new Song("Bad Trip", "Vancouver BC", R.drawable.baseline_open_in_new_black_18));
        songs.add(new Song("Sonic Meltdown", "Billings Montana", R.drawable.baseline_open_in_new_black_18));
        songs.add(new Song("My Name Is Jack", "Boise Idaho", R.drawable.baseline_open_in_new_black_18));
        songs.add(new Song("08/04/2018", "Starcamp/Weed California", R.drawable.baseline_open_in_new_black_18));
        songs.add(new Song("08/15/2018", "San Fransisco California", R.drawable.baseline_open_in_new_black_18));
        songs.add(new Song("09/11/2018", "Los Angeles Califonia", R.drawable.baseline_open_in_new_black_18));
        songs.add(new Song("10/01/2018", "Ensenada Mexico", R.drawable.baseline_open_in_new_black_18));
        songs.add(new Song("10/31/2018", "Secret Location Argentina", R.drawable.baseline_open_in_new_black_18));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id){
                Song selectedItem = (Song) adapter.getItemAtPosition(position);

                Intent playSelected = new Intent(TracksActivity.this,DetailActivity.class);





                playSelected.putExtra(ID_SONG, selectedItem.getmSongName());

                playSelected.putExtra(ID_ALBUM, selectedItem.getmAlbumName());

                playSelected.putExtra("ID_ART", selectedItem.getImageResourceId());
                startActivity(playSelected);
            }
        });


    }
}

