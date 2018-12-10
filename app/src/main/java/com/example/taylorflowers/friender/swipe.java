package com.example.taylorflowers.friender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class swipe extends AppCompatActivity {

    private People user = People.curr;

    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        newCard();
    }

    public void swipeRight(View view) { //TODO: fix null pointer error 
        People liked = People.getLiked(i);
        user.addLiked(liked);
        i++;
        newCard();
    }

    public void swipeLeft(View view) {
        i++;
        newCard();
    }

    public void newCard() {
        if (i >= People.peoples.size() - 1) {
            TextView bio = findViewById(R.id.bio);
            TextView name = findViewById(R.id.name);
            name.setText("");
            String str = "You've out matched us! :/";
            bio.setText(str);
        } else {
            TextView name = findViewById(R.id.name);
            TextView bio = findViewById(R.id.bio);
            name.setText(People.peoples.get(i).getName());
            bio.setText(People.peoples.get(i).getBio());
        }
    }

}
