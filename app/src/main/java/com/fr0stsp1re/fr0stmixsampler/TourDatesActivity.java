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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class TourDatesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // Create an array list and populate it
        ArrayList<Info> infos = new ArrayList<Info>();

        infos.add(new Info ("03/25/2018","Portland Oregon", "At the Liquor Store on Belmont", R.drawable.baseline_open_in_new_black_18));
        infos.add(new Info ("07/15/2018","Seattle Washington", "The Green Room. 21+," ,R.drawable.baseline_open_in_new_black_18));
        infos.add(new Info ("07/20/2018","Vancouver BC", "Some Canadian Bar.", R.drawable.baseline_open_in_new_black_18));
        infos.add(new Info ("07/25/2018","Billings Montana", "Road Kill Cafe", R.drawable.baseline_open_in_new_black_18));
        infos.add(new Info ("08/01/2018","Boise Idaho", "Spudland Dance Hall", R.drawable.baseline_open_in_new_black_18));
        infos.add(new Info("08/04/2018","Starcamp/Weed California", "MT SHasta California. Outdoor Venue", R.drawable.baseline_open_in_new_black_18));
        infos.add(new Info ("08/15/2018","San Fransisco California","Pulse SF", R.drawable.baseline_open_in_new_black_18));
        infos.add(new Info ("09/11/2018","Los Angeles Califonia", "Perversions. 3 shows!", R.drawable.baseline_open_in_new_black_18));
        infos.add(new Info ("10/01/2018","Ensenada Mexico", "South of the border fun on the Beach!" ,R.drawable.baseline_open_in_new_black_18));
        infos.add(new Info ("10/31/2018","Secret Location Argentina","A secret appearance at a location to be disclosed day of event.", R.drawable.baseline_open_in_new_black_18));


        InfoAdapter adapter = new InfoAdapter(this, infos);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
