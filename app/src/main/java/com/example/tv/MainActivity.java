package com.example.tv;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {
    ImageView rotateImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotateImage = findViewById(R.id.imageRotate);
    }

    public void btn_rotate(View view) {
        Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        rotateImage.startAnimation(rotate);
    }
}