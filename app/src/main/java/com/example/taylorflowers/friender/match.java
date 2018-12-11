package com.example.taylorflowers.friender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class match extends AppCompatActivity {
    People user = People.curr;

    public int i = 0;
    List<People> match = user.getMatches();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        if (match.size() == 0) {
            Toast errorToast = Toast.makeText(match.this, "No matches yet! Keep swiping to get matches!", Toast.LENGTH_SHORT);
            errorToast.show();
        } else {
            TextView name = findViewById(R.id.name);
            TextView bio = findViewById(R.id.bio);
            TextView num = findViewById(R.id.phone);
            name.setText(match.get(i).getName());
            bio.setText(match.get(i).getBio());
            num.setText(match.get(i).getNumber());
        }
    }

    public void goNext(View view) {
        if (i >= match.size() - 1) {
            Toast errorToast = Toast.makeText(match.this, "No more matches!", Toast.LENGTH_SHORT);
            errorToast.show();
        } else {
            i++;
            changeCard();
        }
    }

    public void goBack(View view) {
        if (i <= 0) {
            Toast errorToast = Toast.makeText(match.this, "No more matches!", Toast.LENGTH_SHORT);
            errorToast.show();
        } else {
            i--;
            changeCard();
        }
    }

    public void changeCard() {
        TextView name = findViewById(R.id.name);
        TextView bio = findViewById(R.id.bio);
        TextView num = findViewById(R.id.phone);
        name.setText(match.get(i).getName());
        bio.setText(match.get(i).getBio());
        num.setText(match.get(i).getNumber());
    }


}
