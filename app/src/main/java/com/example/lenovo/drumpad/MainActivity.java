package com.example.lenovo.drumpad;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        b10 = (Button) findViewById(R.id.btn10);
        b11 = (Button) findViewById(R.id.btn11);
        b12 = (Button) findViewById(R.id.btn12);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.bassdrum1);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.bassdrum2);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.handdrum);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.closedhihat2);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.closedhihat4);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.doumbektek);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.highconga1);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.lowconga2);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.hibongo);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.hibongo);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.lowbongo);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.crash);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b1.startAnimation(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b2.startAnimation(a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b3.startAnimation(a);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b4.startAnimation(a);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer5.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b5.startAnimation(a);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer6.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b6.startAnimation(a);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer7.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b7.startAnimation(a);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer8.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b8.startAnimation(a);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer9.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b9.startAnimation(a);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer10.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b10.startAnimation(a);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer11.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b11.startAnimation(a);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer12.start();
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                b12.startAnimation(a);
            }
        });
    }
}
