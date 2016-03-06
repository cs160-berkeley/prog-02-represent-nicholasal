package com.cs160.joleary.catnip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by nicho on 3/5/2016.
 */
public class CustomSwipeAdapter extends PagerAdapter{
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx)
    {
        this.ctx = ctx;
    }
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout,container,false);
        TextView textView = (TextView)item_view.findViewById(R.id.the_name);
        TextView textView2 = (TextView)item_view.findViewById(R.id.the_party);
        TextView textView3 = (TextView)item_view.findViewById(R.id.vote);
        Button detail_btn = (Button)item_view.findViewById(R.id.detailed);



        if (position == 1){
            textView.setText("Dianne Feinstein");
            textView2.setText("Democrat");
            detail_btn.setVisibility(View.VISIBLE);
            detail_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nextScreen = new Intent(v.getContext(), WatchToPhoneService.class);
                    //Sending data to another Activity
                    String test = "dianne";
                    nextScreen.putExtra("name", test);
                    v.getContext().startService(nextScreen);
                }
            });

        }
        if (position == 2){
            textView.setText("Barbara Boxer");
            textView2.setText("Democrat");
            detail_btn.setVisibility(View.VISIBLE);
            detail_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nextScreen = new Intent(v.getContext(), WatchToPhoneService.class);
                    //Sending data to another Activity
                    String test = "barbara";
                    nextScreen.putExtra("name", test);
                    v.getContext().startService(nextScreen);
                }
            });
        }
        if (position == 3){
            textView.setText("Mark DeSaulnier");
            textView2.setText("Democrat");
            detail_btn.setVisibility(View.VISIBLE);
            detail_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nextScreen = new Intent(v.getContext(), WatchToPhoneService.class);
                    //Sending data to another Activity
                    String test = "mark";
                    nextScreen.putExtra("name", test);
                    v.getContext().startService(nextScreen);
                }
            });
        }
        if (position == 4){
            textView.setText("LA County,CA");
            textView2.setText("Obama,Romney : 65.7%,32.1%");
            textView3.setVisibility(View.VISIBLE);
            textView3.setText("Presidential Vote 2012");
        }
        container.addView(item_view);
        return item_view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
