package com.appdid.mumbaimetro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button mStaion, mFare, mTime, mRecharge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mStaion = findViewById(R.id.metro);
        mFare = findViewById(R.id.fare12);
        mTime = findViewById(R.id.timetable);
        mRecharge = findViewById(R.id.rec);


            mStaion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentstation = new Intent(Main2Activity.this, Main3Activity.class);
                    startActivity(intentstation);
                }
            });
        mFare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentfare = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intentfare);
            }
        });

        mTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttime = new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(intenttime);
            }
        });

        mRecharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentrec = new Intent(Main2Activity.this,Main6Activity.class);
                startActivity(intentrec);
            }
        });
    }
}
