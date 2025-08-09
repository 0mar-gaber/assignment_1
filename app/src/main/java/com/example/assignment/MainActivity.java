package com.example.assignment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView ;

    ArrayList<String> userNames = new ArrayList<>();

    RecyclerViewAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecyclerView);

        for (int i = 0 ; i < 100 ; i++){
            userNames.add("omar gaber "+i);
        }

        adapter = new RecyclerViewAdapter(userNames,this);

        setUpRecyclerView();


    }

    private void setUpRecyclerView() {
        recyclerView.setAdapter(adapter);

    }
}