package com.example.mac.takehomeassignment07_mengqiz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 3/21/18.
 */

public class SingerAdapter extends RecyclerView.Adapter<SingerViewHolder> {
    private List<Singer> singers;
    private Context context;

    public SingerAdapter(List<Singer> singers, Context context) {
        this.singers = singers;
        this.context = context;
    }

    @Override
    public SingerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_singer, parent, false);
        return new SingerViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(SingerViewHolder holder, int position) {
        Singer singer = singers.get(position);
        holder.getSingerNameView().setText(singer.getName());
        holder.getSingerInfoView().setText(singer.getInfo());
        holder.getSingerPhotoView().setImageResource(singer.getPhotoId());
    }

    @Override
    public int getItemCount() {
        return singers.size();
    }
}
