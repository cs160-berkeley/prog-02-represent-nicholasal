package com.cs160.joleary.catnip;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class detailed extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        ImageView image = (ImageView) findViewById(R.id.picture);
        TextView detailed_name = (TextView) findViewById(R.id.detailed_name);
        TextView detailed_party = (TextView) findViewById(R.id.detailed_party);
        TextView detailed_terms = (TextView) findViewById(R.id.detailed_terms);
        TextView detailed_com_1 = (TextView) findViewById(R.id.detailed_com_1);
        TextView detailed_com_2 = (TextView) findViewById(R.id.detailed_com_2);
        TextView detailed_com_3 = (TextView) findViewById(R.id.detailed_com_3);
        TextView detailed_bill_1 = (TextView) findViewById(R.id.detailed_bill_1);
        TextView detailed_bill_2 = (TextView) findViewById(R.id.detailed_bill_2);
        TextView detailed_bill_3 = (TextView) findViewById(R.id.detailed_bill_3);
        Bundle extras = getIntent().getExtras();
        String the_name = extras.getString("name");
        if (the_name.equals("dianne")) {
            image.setImageResource(R.drawable.dianne_feinstein);
            detailed_name.setText("Dianne Feinstein");
            detailed_party.setText("Democrat");
            detailed_terms.setText("Terms End: January 3, 2019");
            detailed_com_1.setText("- Approritions Committee");
            detailed_com_2.setText("- Judiciry Committee");
            detailed_com_3.setText("- Test Committee");
            detailed_bill_1.setText("- test1");
            detailed_bill_2.setText("- test2");
            detailed_bill_3.setText("- test3");
        }
        if (the_name.equals("barbara")) {
            image.setImageResource(R.drawable.barbara_boxer);
            detailed_name.setText("Barbara Boxer");
            detailed_party.setText("Democrat");
            detailed_terms.setText("Terms End: January 6, 2019");
            detailed_com_1.setText("- Approritions Committee");
            detailed_com_2.setText("- Judiciry Committee");
            detailed_com_3.setText("- Test Committee");
            detailed_bill_1.setText("- test4");
            detailed_bill_2.setText("- test5");
            detailed_bill_3.setText("- test6");
        }
        if (the_name.equals("mark")) {
            image.setImageResource(R.drawable.mark);
            detailed_name.setText("Mark DeSaulnier");
            detailed_party.setText("Democrat");
            detailed_terms.setText("Terms End: January 8, 2019");
            detailed_com_1.setText("- Approritions Committee");
            detailed_com_2.setText("- Judiciry Committee");
            detailed_com_3.setText("- Test Committee");
            detailed_bill_1.setText("- test1");
            detailed_bill_2.setText("- test2");
            detailed_bill_3.setText("- test3");
        }
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
                "detailed Page", // TODO: Define a title for the content shown.
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
                "detailed Page", // TODO: Define a title for the content shown.
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
