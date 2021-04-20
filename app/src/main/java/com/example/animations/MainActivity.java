package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartImageShowing = true;
    int animationType = 1;



    public void fade(View view) {

        Log.i("Info", "Fade Animations");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = findViewById(R.id.homerImageView);

        if(bartImageShowing) {
            bartImageView.animate().alpha(0).setDuration(2000);
            homerImageView.animate().alpha(1).setDuration(2000);
            bartImageShowing = false;
        } else {
            homerImageView.animate().alpha(0).setDuration(2000);
            bartImageView.animate().alpha(1).setDuration(2000);
            bartImageShowing = true;
        }

    }

    public void translation(View view) {

        Log.i("Info", "Translation Animation");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = findViewById(R.id.homerImageView);

        if(bartImageShowing) {
            bartImageView.animate().translationY(1200).setDuration(2000);
            bartImageShowing = false;
        } else {
            homerImageView.animate().translationX(-1000).setDuration(2000);
            bartImageShowing = true;
        }

    }

    public void rotation(View view) {
        Log.i("Info", "Rotation Animation");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = findViewById(R.id.homerImageView);

        bartImageView.animate().rotation(1800).alpha(0).setDuration(2000);
    }

    public void scale(View view) {
        Log.i("Info", "Scale Animation");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = findViewById(R.id.homerImageView);

        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
    }

    public void bartComesFromLeft(View view) {
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = findViewById(R.id.homerImageView);
        bartImageView.animate().translationX(1000).setDuration(1000);
    }

    public void animations(View view) {
        if(animationType == 1) {
            fade(view);
            animationType = 2;
        } else if(animationType == 2) {
            translation(view);
            animationType = 3;
        } else if(animationType == 3) {
            rotation(view);
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        bartImageView.setX(-1200);
        bartImageView.animate().translationXBy(1200).rotation(3600).setDuration(2000);

    }
}