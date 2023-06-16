package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    ImageButton imageButton1;
    ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
    }

    public void gotokargil(View view) {
        Intent i = new Intent(this, Kargil.class);
        startActivity(i);

    }

    public void gotoleh(View view) {
        Intent i = new Intent(this, Leh.class);
        startActivity(i);
    }
}
