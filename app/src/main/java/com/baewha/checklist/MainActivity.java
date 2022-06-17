package com.baewha.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnrice, btnwater, btnexercise, btnposture, btnhealth, btnfeel, btndiary, btnresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnrice = (Button) findViewById(R.id.btnrice);
        btnrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"식사 점검 화면입니다.",Toast.LENGTH_LONG).show();
                Intent myintent = new Intent(MainActivity.this,rice_page.class);

                startActivity(myintent);
                finish();
            }
        });

        btnwater = (Button) findViewById(R.id.btnwater);
        btnwater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "물 섭취 점검 화면입니다.", Toast.LENGTH_LONG).show();
                Intent myintent2 = new Intent(MainActivity.this,water_page.class);

                startActivity(myintent2);
                finish();
            }
        });

        btnexercise = (Button) findViewById(R.id.btnexercise);
        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"운동 점검 화면입니다", Toast.LENGTH_LONG).show();
                Intent myintent3 = new Intent(MainActivity.this,exercisepage.class);

                startActivity(myintent3);
                finish();
            }
        });

        btnposture = (Button) findViewById(R.id.btnposture);
        btnposture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"바른 자세 점검 화면입니다", Toast.LENGTH_LONG).show();
                Intent myintent4 = new Intent(MainActivity.this,posture_page.class);

                startActivity(myintent4);
                finish();

            }
        });

        btnhealth = (Button) findViewById(R.id.btnhealth);
        btnhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"건강 점검 화면입니다.", Toast.LENGTH_LONG).show();
                Intent myintent5 = new Intent(MainActivity.this,health_page.class);

                startActivity(myintent5);
                finish();
            }
        });

        btnfeel = (Button) findViewById(R.id.btnfeel);
        btnfeel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"행복 점검 화면입니다.", Toast.LENGTH_LONG).show();
                Intent myintent6 = new Intent(MainActivity.this,health_page.class);

                startActivity(myintent6);
                finish();
            }
        });


        btndiary = (Button) findViewById(R.id.btndiary);
        btndiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"하루 일기를 적을 수 있는 페이지입니다.", Toast.LENGTH_LONG).show();
                Intent myintent7 = new Intent(MainActivity.this,diary_page.class);

                startActivity(myintent7);
                finish();
            }
        });

        btnresult =(Button) findViewById(R.id.btnresult);
        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"어플을 평가할 수 있는 페이지입니다.", Toast.LENGTH_LONG).show();
                Intent myintent8 = new Intent(MainActivity.this,diary_page.class);

                startActivity(myintent8);
                finish();

            }
        });

    }
}