package com.example.mac.takehomeassignment07_mengqiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList<Singer> singers;
    private SingerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new SingerAdapter(singers, this);
        recyclerView.setAdapter(adapter);
    }

    private void initialData() {
        singers = new ArrayList<Singer>();
        singers.add(new Singer("Adele", "English", R.drawable.adele));
        singers.add(new Singer("Taylor", "American", R.drawable.taylor));
        singers.add(new Singer("Beyonce", "American", R.drawable.beyonce));
    }

    private Singer getRandomSinger() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Singer("Adele", "English", R.drawable.adele);
        else if (num == 1)
            return new Singer("Taylor", "American", R.drawable.beyonce);
        else
            return new Singer("Beyonce", "American", R.drawable.taylor);
    }

    public void addRandomPerson(View view) {
        singers.add(getRandomSinger());
        adapter.notifyDataSetChanged();
    }
}
