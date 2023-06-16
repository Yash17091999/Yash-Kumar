package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEvent = (Button)findViewById(R.id.btnEvent);
    }
    public void nextPage(View view){
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}
