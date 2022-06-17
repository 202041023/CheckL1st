package com.baewha.checklist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class rice_page extends AppCompatActivity implements View.OnClickListener {
    CheckBox cb1, cb2, cb3 ;
    Button btn1, btn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice_page);

        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb1.setText("아침식사 완료");
                } else {
                    cb1.setText("아침식사");
                }
            }
        });

        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean ischecked) {
                if(ischecked){
                    cb2.setText("점심식사 완료");
                } else {
                    cb2.setText("점심식사");
                }
            }
        });

        cb3 =(CheckBox) findViewById(R.id.cb3);
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean ischecked) {
                if(ischecked){
                    cb3.setText("저녁식사 완료");
                } else {
                    cb3.setText("저녁식사");
                }
            }
        });

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                Toast.makeText(getApplicationContext(), "저장되었습니다", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}