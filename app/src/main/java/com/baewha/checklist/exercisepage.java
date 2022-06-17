package com.baewha.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class exercisepage extends AppCompatActivity implements View.OnClickListener {
    Button btnpulse, btnminus, btn3e;
    ProgressBar probar;
    SeekBar seekbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisepage);

        probar =  (ProgressBar)findViewById(R.id.probar);
        btnpulse = (Button) findViewById(R.id.btnplus);
        btnminus = (Button) findViewById(R.id.btnminus);
        btn3e = (Button) findViewById(R.id.btn3e);
        btn3e.setOnClickListener(this);

        btnpulse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                probar.incrementProgressBy(10);
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                probar.incrementProgressBy(-10);
            }
        });

        final TextView tv2e = (TextView) findViewById(R.id.tv2e);
        SeekBar seekBar1 = (SeekBar) findViewById(R.id.seekbar1);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv2e.setText("진행률 : " + progress + "%");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }


            public void onClick(View view) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn3e:
                Toast.makeText(getApplicationContext(), "변경사항이 저장되었습니다.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}