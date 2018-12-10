package com.example.taylorflowers.friender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void openHome(View view) throws Exception{
        final EditText e = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);
        final EditText n = findViewById(R.id.name);
        final EditText a = findViewById(R.id.age);
        final EditText p = findViewById(R.id.phone); //TODO: phone stuff
        final EditText b = findViewById(R.id.bio);

        String pass = password.getText().toString();
        String email = e.getText().toString();
        People temp = People.containsEmail(email);
        if (temp != null) {
            throw new Exception("email already has an account, sorry!");
        }

        String name = n.getText().toString();
        int age = Integer.parseInt(a.getText().toString());
        String bio = b.getText().toString();

        People user = new People(name, age, bio, 1111111111, email, pass); //TODO: edit phone from 1

        People.setCurr(user);

        Intent intent = new Intent(registration.this, homes.class);
        startActivity(intent);
        finish();
    }
}
