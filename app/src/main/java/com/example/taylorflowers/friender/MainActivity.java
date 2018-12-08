package com.example.taylorflowers.friender;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private int cases = -1;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    cases = 0;
                    //mTextMessage.setText("Welcome to friender!\nAre you ready to sail onto your new friendSHIP ;)");
                    return true;
                case R.id.navigation_dashboard:
                    cases = 1;
                    //mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    cases = 2;
                    //mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mTextMessage = (TextView) findViewById(R.id.message);
//        if (cases == 0) {
//
//        } else if (cases == 1) {
//
//        } else if (cases == 2) {
//
//        }
        final ImageButton plus = findViewById(R.id.plusButton);
        plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void openHome(View view) {
        Intent intent = new Intent(MainActivity.this, homes.class);
        startActivity(intent);
    }

}
