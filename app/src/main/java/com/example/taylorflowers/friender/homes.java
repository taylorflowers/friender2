package com.example.taylorflowers.friender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class homes extends AppCompatActivity {

    People user = People.curr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homes);

        if (user.getMap() != null) {
            ImageView prof = findViewById(R.id.profilepic);
            prof.setImageBitmap(user.getMap());
        }
    }
    public void openFindFriends(View view) {
        System.out.println("Find friends button clicked");
        Intent intent = new Intent(homes.this, swipe.class);
        startActivity(intent);
    }

    public void openMatches(View view) {
        System.out.println("Matches button clicked");
        Intent intent = new Intent(homes.this, match.class);
        startActivity(intent);
    }

    public void openProfile(View view) {
        Intent intent = new Intent(homes.this, Profiler.class);
        System.out.println("here");
        startActivity(intent);
    }

}
