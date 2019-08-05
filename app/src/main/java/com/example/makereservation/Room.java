package com.example.makereservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Room extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        button =(Button) findViewById(R.id.button12);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                openActivity3();
            }
        });

    }
    public void openActivity3() {
        Intent intent = new Intent(this, check.class);
        startActivity(intent);
    }
}
