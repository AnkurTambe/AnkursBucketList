package com.example.ankursbucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CardView placesCard;
    private CardView thingsCard;
    private TextView emailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        placesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placesActivityIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesActivityIntent);
            }
        });

        thingsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thingsActivityIntent = new Intent(MainActivity.this, ThingsActivity.class);
                startActivity(thingsActivityIntent);
            }
        });

        emailAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailAddressIntent = new Intent(Intent.ACTION_SENDTO);
                emailAddressIntent.setData(Uri.parse("mailto:ankurtambe3006@gmail.com"));
                startActivity(emailAddressIntent);
            }
        });
    }

    private void findViews() {
        placesCard = findViewById(R.id.card_places);
        thingsCard = findViewById(R.id.card_things);
        emailAddress = findViewById(R.id.email_address);
    }
}