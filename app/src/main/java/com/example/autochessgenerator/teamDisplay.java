package com.example.autochessgenerator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Context;
import android.media.tv.TvInputService;
import android.os.Bundle;
import android.text.method.ArrowKeyMovementMethod;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.autochessgenerator.MainActivity.getPlayerTeam;
import static com.example.autochessgenerator.MainActivity.pieces;
import static com.example.autochessgenerator.MainActivity.teamList;
import static com.example.autochessgenerator.MainActivity.weightedAdded;

public class teamDisplay extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();
    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_display);


        initRecyclerView(teamList);

    }

    private void initRecyclerView(ArrayList<ArrayList<Piece>> data){
        SnapHelperOneByOne snapHelper = new SnapHelperOneByOne();


        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        snapHelper.attachToRecyclerView(recyclerView);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, data);
        recyclerView.setAdapter(adapter);
    }
}
