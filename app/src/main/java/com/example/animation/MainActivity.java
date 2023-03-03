package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView androidImage;
    Button translate;
    Button scale;
    Button rotation;
    Button alpha;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidImage=findViewById(R.id.androidImage);
        translate=findViewById(R.id.translate);
        scale=findViewById(R.id.scale);
        rotation=findViewById(R.id.rotation);
        alpha=findViewById(R.id.alpha);

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation translateAnim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                androidImage.startAnimation(translateAnim);
            }
        });
        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scaleAnim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                androidImage.startAnimation(scaleAnim);
            }
        });
        rotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotationAnim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                androidImage.startAnimation(rotationAnim);
            }
        });
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alphaAnim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                androidImage.startAnimation(alphaAnim);
            }
        });
    }
}