package com.example.mac.takehomeassignment07_mengqiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void shareIt(MenuItem item) {
        Toast.makeText(this,"Share it baby", Toast.LENGTH_SHORT).show();
    }

    public void saveIt(MenuItem item) {
        Toast.makeText(this,"Save it baby", Toast.LENGTH_SHORT).show();
    }


    public void recyclerView(MenuItem item) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }
}
