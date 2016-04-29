package com.example.adric.zoound;

import android.media.MediaPlayer;

import android.os.Bundle;

import android.app.Activity;

import android.view.Menu;

import android.view.View;

import android.widget.Button;

import android.widget.ImageView;



public class parrot_details extends Activity {

    MediaPlayer player;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parrot_details);
        ImageView imageview=(ImageView)findViewById(R.id.imageView);
        Button button1=(Button)findViewById(R.id.parrotSound);
        //Button button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //  player=MediaPlayer.create(MainActivity.this,R.raw.dog);
                player=MediaPlayer.create(parrot_details.this,R.raw.Parrot);
                player.start();
            }
        });

        // button2.setOnClickListener(new View.OnClickListener() {
        //   @Override

        //      public void onClick(View v) {

        //       player.pause();
    }
    //  });
}
//}
