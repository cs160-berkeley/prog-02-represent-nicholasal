package com.cs160.joleary.catnip;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

public class congressional extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congressional);

        TextView name1 = (TextView) findViewById(R.id.name_1);
        TextView party1 = (TextView) findViewById(R.id.party_1);
        TextView email1 = (TextView) findViewById(R.id.email_1);
        TextView website1 = (TextView) findViewById(R.id.website_1);
        TextView tweet1 = (TextView) findViewById(R.id.tweet_1);
        TextView name2 = (TextView) findViewById(R.id.name_2);
        TextView party2 = (TextView) findViewById(R.id.party_2);
        TextView email2 = (TextView) findViewById(R.id.email_2);
        TextView website2 = (TextView) findViewById(R.id.website_2);
        TextView tweet2 = (TextView) findViewById(R.id.tweet_2);
        TextView name3 = (TextView) findViewById(R.id.name_3);
        TextView party3 = (TextView) findViewById(R.id.party_3);
        TextView email3 = (TextView) findViewById(R.id.email_3);
        TextView website3 = (TextView) findViewById(R.id.website_3);
        TextView tweet3 = (TextView) findViewById(R.id.tweet_3);
        ImageButton senator1 = (ImageButton) findViewById(R.id.senator_1);
        ImageButton senator2 = (ImageButton) findViewById(R.id.senator_2);
        ImageButton houserep = (ImageButton) findViewById(R.id.house_rep);
        String zip_code;
        Bundle extras = getIntent().getExtras();
        zip_code = extras.getString("code");
        if (zip_code.equals("94523")) {
            name1.setText("Senator Dianne Feinstein");
            party1.setText("Party: Democrat");
            email1.setText("Email: dfeinstein@gmail.com");
            website1.setText("Website: feinstein@senate.gov");
            tweet1.setText("Last Tweet: I love Sandwich!!");
            name2.setText("Senator Barbara Boxer");
            party2.setText("Party: Democrat");
            email2.setText("Email: senator@boxer.senate.gov");
            website2.setText("Website: www.boxer.senate.gov");
            tweet2.setText("Last Tweet: I love Burger!!");
            name3.setText("Mark DeSaulnier");
            party3.setText("Party: Democrat");
            email3.setText("Email: desaulnier@gmail.com");
            website3.setText("Website: desaulnier.house.gov");
            tweet3.setText("Last Tweet: I love Pizza!!");
        }
//        else {
//            name1.setText("Senator Dianne Feinstein");
//            party1.setText("Party: Democrat");
//            email1.setText("Email: dfeinstein@gmail.com");
//            website1.setText("Website: feinstein@senate.gov");
//            tweet1.setText("Last Tweet: I love Sandwich!!");
//            name2.setText("Senator Barbara Boxer");
//            party2.setText("Party: Democrat");
//            email2.setText("Email: senator@boxer.senate.gov");
//            website2.setText("Website: www.boxer.senate.gov");
//            tweet2.setText("Last Tweet: I love Burger!!");
//            name3.setText("Mark DeSaulnier");
//            party3.setText("Party: Democrat");
//            email3.setText("Email: desaulnier@gmail.com");
//            website3.setText("Website: desaulnier.house.gov");
//            tweet3.setText("Last Tweet: I love Pizza!!");
//        }
        senator1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(congressional.this, detailed.class);
                //Sending data to another Activity
                String test = "dianne";
                nextScreen.putExtra("name", test);
                startActivity(nextScreen);
            }
        });
        senator2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(congressional.this, detailed.class);
                //Sending data to another Activity
                nextScreen.putExtra("name", "barbara");
                startActivity(nextScreen);
            }
        });
        houserep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(congressional.this, detailed.class);
                //Sending data to another Activity
                nextScreen.putExtra("name", "mark");
                startActivity(nextScreen);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "congressional Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.cs160.joleary.catnip/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "congressional Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.cs160.joleary.catnip/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
