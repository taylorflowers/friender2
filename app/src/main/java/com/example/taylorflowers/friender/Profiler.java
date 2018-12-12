package com.example.taylorflowers.friender;

import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class Profiler extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    People user = People.curr;

    Camera camera;
    ShowCamera showCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiler);

        user.setMap(null);

        if (user.getMap() != null) {
            ImageView pic = findViewById(R.id.profilePic);
            pic.setImageBitmap(user.getMap());
        }

        TextView n = findViewById(R.id.name);
        TextView p = findViewById(R.id.phone);
        TextView b = findViewById(R.id.bio);

        n.setText(user.getName());
        p.setText(Long.toString(user.getNumber()));
        b.setText(user.getBio());

        camera = Camera.open();
        showCamera = new ShowCamera(this, camera);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        ImageView pic = findViewById(R.id.profilePic);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            user.setMap(imageBitmap);
            pic.setImageBitmap(imageBitmap);
        }
    }

    public void dispatchTakePictureIntent(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}
