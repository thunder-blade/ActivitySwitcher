package com.example.dell.activityswitcher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 14-11-2016.
 */
public class CardsAdapter extends ArrayAdapter<Card> {
    private final ArrayList<Card> cards;
    private final LayoutInflater layoutInflater;

    public CardsAdapter(Context context, ArrayList<Card> cards) {
        super(context, -1);
        this.cards = cards;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Card card = cards.get(position);
        View view = layoutInflater.inflate(R.layout.item, parent, false);
      //  ((ImageView)view.findViewById(R.id.card_image)).setImageResource(card.imageId);
        ((TextView)view.findViewById(R.id.helloText)).setText(card.getName());
        return view;
    }

    @Override
    public Card getItem(int position) {
        return cards.get(position);
    }

    @Override
    public int getCount() {
        return cards.size();
    }
}