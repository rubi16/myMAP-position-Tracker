package com.example.mymap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstDIsplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_d_isplay);
    }

    public void openmap(View view) {
        startActivity(new Intent(this,MapsActivity.class));
    }
}