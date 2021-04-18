package com.example.b3rc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCetak;
    private ArrayList<BallModel> Ball = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCetak = findViewById(R.id.mainRV);
        rvCetak.setHasFixedSize(true);
        Ball.addAll(BallData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCetak.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        BallAdapter tankAdapter = new BallAdapter(this);
        tankAdapter.setBallModels(Ball);
        rvCetak.setAdapter(tankAdapter);
    }
}