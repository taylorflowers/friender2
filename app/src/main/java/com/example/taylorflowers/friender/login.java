package com.example.taylorflowers.friender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) throws Exception{
        final EditText email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);
        String pass = password.getText().toString();
        String str = email.getText().toString();
        People temp = People.containsEmail(str);
        if (temp == null) {
            throw new Exception("Invalid email!");
        }
        if (pass.equals(temp.getPass())) {
            People.setCurr(temp);
            Intent intent = new Intent(login.this, homes.class);
            startActivity(intent);
            finish();
            return;
        }
        throw new Exception("Invalid password!");
    }
}
