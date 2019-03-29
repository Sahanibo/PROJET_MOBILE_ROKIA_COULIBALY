package com.example.poki.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.poki.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void open (View view){
        Intent randomIntent = new Intent(this, MainActivity.class);

// Start the new activity.
        startActivity(randomIntent);
    }
}
