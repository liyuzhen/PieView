package com.rdc.liyuzhen.pieview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.rdc.liyuzhen.pieview.R;
import com.rdc.liyuzhen.pieview.utils.ToastUtil;
import com.rdc.liyuzhen.pieview.view.PieView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieView pv  = (PieView) findViewById(R.id.pv);
        pv.setOnPieViewTouchListener(new PieView.OnPieViewTouchListener() {
            @Override
            public void onTouch(View v, MotionEvent e, PieView.ClickedDirection d) {
                ToastUtil.showToast(MainActivity.this, "点击位置：" + d.name());
            }
        });
    }
}
