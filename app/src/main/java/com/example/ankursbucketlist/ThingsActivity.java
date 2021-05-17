package com.example.ankursbucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);
        RecyclerView recyclerView = findViewById(R.id.recycler_view_things);

        Project[] projects = {
                new Project("Supra", "Its my dream to own a supra, and modify the hell out of it", R.drawable.supra,5f),
                new Project("Skydiving", "I want jump out of a plane, alone, over the Fox glaciers in New Zealand", R.drawable.skydive,3.5f),
                new Project("Road-Trip", "I want to ride from Manali to Leh, on a classic Triumph", R.drawable.road_trip,4.5f),
                new Project("Scuba-Dive", "I want to scuba-dive in the Great Barrier Reef", R.drawable.scubadive,4f),
                new Project("Northern Lights", "I want to witness the amazing Northern-Lights in Norway", R.drawable.northern_lights,4f),
        };

        ProjectAdapter pA = new ProjectAdapter(projects);
        recyclerView.setAdapter(pA);
    }
}