package com.example.android.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        if (getIntent().getExtras() != null) {
            String joke = getIntent().getExtras().getString("joke");
            TextView jokeTextview = findViewById(R.id.textview_joke);
            jokeTextview.setText(joke);
        }
    }
}
