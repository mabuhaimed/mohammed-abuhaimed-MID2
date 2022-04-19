package com.example.midterm_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final DatabaseHelper MyDB = new DatabaseHelper(this);

        Button insert = (Button)findViewById(R.id.buttoninsert);
        insert.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                id_val = idET.getText().toString();
            }
        });
        Button activity1 = (Button)findViewById(R.id.activity1);

        activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
        Button activity3 = (Button)findViewById(R.id.activity3);

        activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });


    }
}