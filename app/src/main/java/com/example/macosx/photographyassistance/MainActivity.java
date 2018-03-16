package com.example.macosx.photographyassistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView about,spot,tips,tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = findViewById(R.id.about);
        spot = findViewById(R.id.spot);
        tips = findViewById(R.id.tips);
        tool = findViewById(R.id.tools);


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);

            }
        });

        spot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Spot.class);
                startActivity(intent);

            }
        });

        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Tips.class);
                startActivity(intent);

            }
        });

        tool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Tools.class);
                startActivity(intent);

            }
        });
    }
}
