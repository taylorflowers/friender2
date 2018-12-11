package com.example.taylorflowers.friender;

import android.content.Intent;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
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
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

//    private TextView mTextMessage;
//    private int cases = -1;
//
//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                    cases = 0;
//                    //mTextMessage.setText("Welcome to friender!\nAre you ready to sail onto your new friendSHIP ;)");
//                    return true;
//                case R.id.navigation_dashboard:
//                    cases = 1;
//                    //mTextMessage.setText(R.string.title_dashboard);
//                    return true;
//                case R.id.navigation_notifications:
//                    cases = 2;
//                    //mTextMessage.setText(R.string.title_notifications);
//                    return true;
//            }
//            return false;
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //line 52-64 create a base of people to swipe thru

        People p = new People("Travis", 19, "heey i love to play guitar", 1111111111, "test@test.com", "password1");
        People a = new People("Jared", 19, "never learned to read", 1111111111, "test1@test.com", "password1");
        People b = new People("Lisa", 20, "BlackPink in your area!", 1111111111, "test2@test.com", "password1");
        People c = new People("Jenny", 20, "Solo", 1111111111, "test3@test.com", "password1");
        People d = new People("Pepper", 20, "The next person to message me an iron man reference gets punched", 1111111111, "test4@test.com", "password1");
        People e = new People("Jimin", 20, "idk nan molla", 1111111111, "test5@test.com", "password1");

        People.peoples.add(a);
        People.peoples.add(b);
        People.peoples.add(c);
        People.peoples.add(d);
        People.peoples.add(e);
        People.peoples.add(p);

    }

    public void openRegister(View view) {
        Intent intent = new Intent(MainActivity.this, registration.class);
        startActivity(intent);
        finish();
    }

    public void openLogin(View view) {
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent);
        finish();
    }


}
