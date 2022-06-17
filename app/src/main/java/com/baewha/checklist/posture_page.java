package com.baewha.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class posture_page extends AppCompatActivity implements View.OnClickListener {
    CheckBox cb1p;
    Button btn1p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posture_page);

        cb1p = (CheckBox) findViewById(R.id.cb1p);
        cb1p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cb1p.setText("잘하셨어요!");
                } else {
                    cb1p.setText("바른 자세를 유지하셨나요?");
                }

            }
        });

        btn1p = (Button) findViewById(R.id.btn1p);
        btn1p.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1p:
                Toast.makeText(getApplicationContext(), "변경사항을 저장합니다.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}