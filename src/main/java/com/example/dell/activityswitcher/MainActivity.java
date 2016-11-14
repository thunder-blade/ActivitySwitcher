    package com.example.dell.activityswitcher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;

import in.arjsna.swipecardlib.SwipeCardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Card> al = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            al.add(new Card("Card number "+ i));
        }
        CardsAdapter arrayAdapter = new CardsAdapter(this, al );
        SwipeCardView swipeCardView = (SwipeCardView) findViewById(R.id.frame);
        swipeCardView.setAdapter(arrayAdapter);
        swipeCardView.setFlingListener(new SwipeCardView.OnCardFlingListener() {
            public static final String TAG = "hi";
            @Override
            public void onCardExitLeft(Object dataObject) {
                Log.i(TAG, "Left Exit");
            }

            @Override
            public void onCardExitRight(Object dataObject) {
                Log.i(TAG, "Right Exit");
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
                Log.i(TAG, "Adater to be empty");
                //add more items to adapter and call notifydatasetchanged
            }

            @Override
            public void onScroll(float scrollProgressPercent) {
                Log.i(TAG, "Scroll");
            }

            @Override
            public void onCardExitTop(Object dataObject) {
                Log.i(TAG, "Top Exit");
            }

            @Override
            public void onCardExitBottom(Object dataObject) {
                Log.i(TAG, "Bottom Exit");
            }
        });
    }


}
