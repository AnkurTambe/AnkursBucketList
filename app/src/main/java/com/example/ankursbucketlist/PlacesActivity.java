package com.example.ankursbucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        RecyclerView recyclerView = findViewById(R.id.recycler_view_places);

        Project[] projects = {
                new Project("New York", "I want to visit New York because its beautiful", R.drawable.new_york,5f),
                new Project("Italy", "I want to visit Italy because its beautiful", R.drawable.italy,4.5f),
                new Project("Japan", "I want to visit Japan because its beautiful", R.drawable.japan,5f),
                new Project("Kerala", "I want to visit Kerala because its beautiful", R.drawable.kerala,4.5f),
                new Project("Vietnam", "I want to visit Vietnam because its beautiful", R.drawable.vietnam,4f),
        };

        ProjectAdapter pA = new ProjectAdapter(projects);
        recyclerView.setAdapter(pA);
    }
}