package edu.orangecoastcollege.cs273.nhoang53.yarrworld;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    // Define the button as an instance variable (member variable)
    Button speakBttButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Restoring user setting from a previous session
        super.onCreate(savedInstanceState);
        // Inflating (!) opening the layout called activity_main (activity_main.xml)
        setContentView(R.layout.activity_main);

        // Hook up the speakButton to the one in our view: R.id mean Resource
        speakBttButton = (Button) findViewById(R.id.speakButton);

    }
}
