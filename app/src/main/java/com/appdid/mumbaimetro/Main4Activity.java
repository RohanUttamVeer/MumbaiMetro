package com.appdid.mumbaimetro;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Main4Activity extends AppCompatActivity {

    Button mSingle, mRetrun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Fare");
        setContentView(R.layout.activity_main4);
        mSingle = findViewById(R.id.single_journey);
        mRetrun = findViewById(R.id.return_journey);
        mSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentstation = new Intent(Main4Activity.this, Main7Activity.class);
                startActivity(intentstation);
            }
        });

        mRetrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentstation = new Intent(Main4Activity.this, Main8Activity.class);
                startActivity(intentstation);
            }
        });
    }
}