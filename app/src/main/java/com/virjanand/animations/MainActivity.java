package com.virjanand.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isBartVisible;

    public void fade(View view) {

        float alphaBart = 1;

        if (isBartVisible) {
            alphaBart = 0;
            isBartVisible = false;
        } else {
            isBartVisible = true;
        }

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        bartImageView.animate().alpha(alphaBart).setDuration(2000);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
        homerImageView.animate().alpha(1-alphaBart).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isBartVisible = true;
    }
}
