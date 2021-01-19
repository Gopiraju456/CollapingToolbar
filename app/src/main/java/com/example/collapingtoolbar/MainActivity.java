package com.example.collapingtoolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {
//    Toolbar toolbar;
    AppBarLayout appbar;
    CollapsingToolbarLayout ctb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  setActionBar(toolbar);
        ctb=findViewById(R.id.colllllllll);
        ctb.setTitle("MAhi");



    }

}