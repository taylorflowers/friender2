package com.example.taylorflowers.friender;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class Profiler extends AppCompatActivity {

    FrameLayout frameLayout;
    Camera camera;
    ShowCamera showCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiler);

        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);
        camera = Camera.open();
        showCamera = new ShowCamera(this, camera);
        frameLayout.addView(showCamera);
    }
}
