package com.baewha.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class reult_page extends AppCompatActivity implements View.OnClickListener {
    RatingBar rt1, rt2, rt3;
    Button btn1r;
    TextView tv1r, tv2r, tv3r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reult_page);

        rt1 = (RatingBar) findViewById(R.id.rt1);
        rt1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv1r.setText("전체적인 서비스에 만족하십니까? : " + rating +"로 평가되었습니다.");

            }
        });

        rt2 = (RatingBar) findViewById(R.id.rt2);
        rt2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv2r.setText("어플을 계속 사용하실 마음이 있으십니까?? : " + rating +"로 평가되었습니다.");

            }
        });

        rt3 = (RatingBar) findViewById(R.id.rt3);
        rt3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv3r.setText("페이지 변환이 간편합니까? : " + rating +"로 평가되었습니다.");

            }
        });

        btn1r = (Button) findViewById(R.id.btn1r);
        btn1r.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1r:
                Toast.makeText(getApplicationContext(), "평가해주셔서 감사합니다", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}