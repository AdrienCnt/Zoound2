package com.example.adric.zoound;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class farm_activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button toChicken = (Button) findViewById(R.id.buttonChicken);
        toChicken.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farm_activity.this, chicken_details.class);
                startActivity(intent);
            }


        });
        final Button toCow = (Button) findViewById(R.id.buttonCow);
        toChicken.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farm_activity.this, cow_details.class);
                startActivity(intent);
            }


        });
        final Button toSheep = (Button) findViewById(R.id.buttonSheep);
        toChicken.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farm_activity.this, sheep_details.class);
                startActivity(intent);
            }


        });
    }
}