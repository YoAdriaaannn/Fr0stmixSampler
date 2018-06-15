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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import static com.fr0stsp1re.fr0stmixsampler.TracksActivity.ID_ALBUM;
import static com.fr0stsp1re.fr0stmixsampler.TracksActivity.ID_SONG;
import static com.fr0stsp1re.fr0stmixsampler.TracksActivity.ID_ART;


import java.util.ArrayList;

// Details of a song or mix are handled in this activity
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // String vars to hold passed track info
        String nowSong = "", nowAlbum = "";

        // int to hold res id for drawables
        int nowPlayArt = 0;

        // Gets intent and ListView item data from selected adapter
        Intent intent = getIntent();
        if (null != intent) {

            nowSong = intent.getStringExtra(ID_SONG);
            nowAlbum = intent.getStringExtra(ID_ALBUM);
            nowPlayArt = intent.getIntExtra("ID_ART", 0);
        }

        // Sets data to appropriate TextViews
        TextView playingSongText = (TextView) findViewById(R.id.playing_song);
        playingSongText.setText(nowSong);

        TextView playingAlbumText = (TextView) findViewById(R.id.playing_album);
        playingAlbumText.setText(nowAlbum);

        // Set album art
        ImageView playingAlbumArt = (ImageView) findViewById(R.id.album_art);
            playingAlbumArt.setImageResource(nowPlayArt);

        // Set onClickListeners for navigation
        TextView mixes = (TextView) findViewById(R.id.mixes);
        mixes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this, MixesActivity.class);
                startActivity(i);
            }
        });

        TextView tourDates = (TextView) findViewById(R.id.tour_dates);
        tourDates.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(DetailActivity.this, TourDatesActivity.class);
                startActivity(i);
            }
        });

        TextView tracks = (TextView) findViewById(R.id.tracks);
        tracks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(DetailActivity.this, TracksActivity.class);
                startActivity(i);
            }
        });

    }
}