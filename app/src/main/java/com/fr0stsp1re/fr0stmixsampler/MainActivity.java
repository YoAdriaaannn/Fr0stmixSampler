package com.fr0stsp1re.fr0stmixsampler;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set onClickListeners for navigation
        TextView mixes = (TextView) findViewById(R.id.mixes);
        mixes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MixesActivity.class);
                startActivity(i);
            }
        });

        TextView tourDates = (TextView) findViewById(R.id.tour_dates);
        tourDates.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, TourDatesActivity.class);
                startActivity(i);
            }
        });

        TextView tracks = (TextView) findViewById(R.id.tracks);
        tracks.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent i = new Intent(MainActivity.this, TracksActivity.class);
                startActivity(i);
            }
        });
    }
}
