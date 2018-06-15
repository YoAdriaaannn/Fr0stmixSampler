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
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MixesActivity extends AppCompatActivity {

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

        songs.add(new Song("Psytrance", "Ermuhgerd2", R.drawable.erma));
        songs.add(new Song("Psytrance", "Most Aweful Mix", R.drawable.lemon));
        songs.add(new Song("Psytrip", "Mothership Summoning", R.drawable.mothership));
        songs.add(new Song("Prog PSy", "Niramur", R.drawable.starcamp));
        songs.add(new Song("Dark Psy", "Area51", R.drawable.area51));
        songs.add(new Song("Psytrance", "Charge Da Lazerz", R.drawable.lazers));
        songs.add(new Song("Techno", "Ice Cold Techno", R.drawable.icecold));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Set on click listener for list view to send user to detail info activity and player.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id){
                Song selectedItem = (Song) adapter.getItemAtPosition(position);

                Intent playSelected = new Intent(MixesActivity.this,DetailActivity.class);

                // Set variables to send with intent to rec at detail activity
                playSelected.putExtra(ID_SONG, selectedItem.getmSongName());
                playSelected.putExtra(ID_ALBUM, selectedItem.getmAlbumName());
                playSelected.putExtra("ID_ART", selectedItem.getImageResourceId());
                startActivity(playSelected);
            }
        });
    }
}
