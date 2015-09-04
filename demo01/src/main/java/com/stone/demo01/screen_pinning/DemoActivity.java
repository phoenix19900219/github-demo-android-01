package com.stone.demo01.screen_pinning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.stone.demo01.R;

/**
 * @author changshizhou (changshizhou@anjuke)
 * @date 15/9/2
 * @desc
 */
public class DemoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_pinning);



        findViewById(R.id.start_pinning).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLockTask();
            }
        });
        findViewById(R.id.start_pinning1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        findViewById(R.id.stop_pinning).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopLockTask();
            }
        });
    }
}
