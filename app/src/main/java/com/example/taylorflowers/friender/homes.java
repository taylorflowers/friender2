package com.example.taylorflowers.friender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homes);

    }
    public void openFindFriends(View view) {
        System.out.println("Find friends button clicked");
    }

    public void openMatches(View view) {
        System.out.println("Matches button clicked");
    }

}
