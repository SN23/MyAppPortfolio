package com.sukhjinder.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//      Spotify Streamer
        final Button SpotifyStreamer = (Button) findViewById(R.id.SpotifyStreamerbutton);
        SpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch the Spotify Streamer App" , Toast.LENGTH_SHORT).show();
            }
        });


//      Scores App
        final Button Scores = (Button) findViewById(R.id.ScoresAppbutton);
        Scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch the Scores App", Toast.LENGTH_SHORT).show();
            }
        });

//      Library App
        final Button Library = (Button) findViewById(R.id.LibraryAppbutton);
        Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch the Library App",Toast.LENGTH_SHORT).show();
            }
        });

//      Build It Bigger App
        final Button BuildItBigger = (Button) findViewById(R.id.BuildItBiggerbutton);
        BuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch the Build It bigger App" , Toast.LENGTH_SHORT).show();
            }
        });

//      XYZReader App
        final Button XYZReader = (Button) findViewById(R.id.XYZReaderbutton);
        XYZReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch the XYZ Reader App", Toast.LENGTH_SHORT).show();
            }
        });

//      Capstone App
        final Button Capstone = (Button) findViewById(R.id.Capstonebutton);
        Capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
