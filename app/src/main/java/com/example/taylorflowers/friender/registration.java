package com.example.taylorflowers.friender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        final EditText p = findViewById(R.id.phone);
        final EditText b = findViewById(R.id.bio);

        String pass = password.getText().toString();
        String email = e.getText().toString();
        People temp = People.containsEmail(email);
        if (temp != null) {
            Toast errorToast = Toast.makeText(registration.this, "Email already exists! Sorry. Try again!", Toast.LENGTH_SHORT);
            errorToast.show();
        } else if (!email.contains("@")) {
            Toast errorToast = Toast.makeText(registration.this, "Email is not valid. Try again!", Toast.LENGTH_SHORT);
            errorToast.show();
        } else {
            String name = n.getText().toString();
            int age = Integer.parseInt(a.getText().toString());
            String bio = b.getText().toString();
            String phoneTemp = p.getText().toString();
            long phone = Long.parseLong(phoneTemp);
            People user = new People(name, age, bio, phone, email, pass);

            People.setCurr(user);

            Intent intent = new Intent(registration.this, homes.class);
            startActivity(intent);
            finish();
        }
    }
}
