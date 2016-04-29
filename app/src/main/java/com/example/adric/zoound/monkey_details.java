package com.example.adric.zoound;

import android.media.MediaPlayer;

import android.os.Bundle;

import android.app.Activity;

import android.view.Menu;

import android.view.View;

import android.widget.Button;

import android.widget.ImageView;



public class monkey_details extends Activity {

    MediaPlayer player;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monkey_details);
        ImageView imageview=(ImageView)findViewById(R.id.imageView);
        Button button1=(Button)findViewById(R.id.monkeySound);
        //Button button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //  player=MediaPlayer.create(MainActivity.this,R.raw.dog);
                player=MediaPlayer.create(monkey_details.this,R.raw.monkey);
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
