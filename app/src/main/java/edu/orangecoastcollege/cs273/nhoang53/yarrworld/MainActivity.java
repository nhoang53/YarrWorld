package edu.orangecoastcollege.cs273.nhoang53.yarrworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    // Define the button as an instance variable (member variable)
    private Button speakButton;
    private Context context = this;

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
        speakButton = (Button) findViewById(R.id.speakButton);

        //wire up the speakButton to perform on onCLick event
        speakButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Use the static reference to "Toast" to display the message:
                // Toast = vanishes after set amount of time
                // Dialog = requires user input

                Toast.makeText(context, R.string.toast_text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
