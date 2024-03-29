package com.cs160.joleary.catnip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {
    //there's not much interesting happening. when the buttons are pressed, they start
    //the PhoneToWatchService with the cat name passed in.

    private Button SubmitButton;
    private EditText zipCode;
    private Button CurrentLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zipCode = (EditText) findViewById(R.id.zip_code);
        SubmitButton = (Button) findViewById(R.id.submit);
        CurrentLocation = (Button) findViewById(R.id.current);

        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainActivity.this, congressional.class);
                Intent toWatch = new Intent(MainActivity.this,PhoneToWatchService.class);
                //Sending data to another Activity
                nextScreen.putExtra("code", zipCode.getText().toString());
                toWatch.putExtra("code", zipCode.getText().toString());
                startActivity(nextScreen);
                startService(toWatch);
            }
        });

        CurrentLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainActivity.this, congressional.class);
                Intent toWatch = new Intent(MainActivity.this,PhoneToWatchService.class);
                //Sending data to another Activity
                nextScreen.putExtra("code", "94523");
                toWatch.putExtra("code", "94523");
                startActivity(nextScreen);
                startService(toWatch);
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
