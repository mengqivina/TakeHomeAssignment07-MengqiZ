package com.example.mac.takehomeassignment07_mengqiz;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mac on 3/21/18.
 */

public class SingerViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView singerNameView;
    private TextView singerInfoView;
    private ImageView singerPhotoView;
    private Context context;

    public SingerViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        singerNameView = (TextView) itemView.findViewById(R.id.person_name);
        singerInfoView = (TextView) itemView.findViewById(R.id.person_info);
        singerPhotoView = (ImageView) itemView.findViewById(R.id.person_photo);
        this.context = context;

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, singerNameView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public TextView getSingerNameView() {
        return singerNameView;
    }

    public TextView getSingerInfoView() {
        return singerInfoView;
    }

    public ImageView getSingerPhotoView() {
        return singerPhotoView;
    }

}
