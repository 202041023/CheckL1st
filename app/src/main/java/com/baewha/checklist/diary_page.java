package com.baewha.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class diary_page extends AppCompatActivity implements View.OnClickListener {
    Button btn1d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_page);

        btn1d = (Button) findViewById(R.id.btn1d);
        btn1d.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1d:
                Toast.makeText(getApplicationContext(), "변경사항을 저장합니다.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}