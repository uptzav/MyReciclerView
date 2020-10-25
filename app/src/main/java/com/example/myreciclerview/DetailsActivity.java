package com.example.myreciclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String club ="";
        Bundle extras = getIntent().getExtras();
        if (extras !=null){
            club = extras.getString("club");

        }

    }
}