package com.krootoom.hds_register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CallActivity extends AppCompatActivity {

    private Button btnCallBack;
    private Button btnCallNext;
    private View.OnClickListener onClickCallBack = new View.OnClickListener() {

        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), NameActivity.class);
            startActivity(i);
        }
    };
    private View.OnClickListener onClickCallNext = new View.OnClickListener() {

        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), UserActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hds_register_call);

        btnCallBack = (Button) findViewById(R.id.btnCallBack);
        btnCallNext = (Button) findViewById(R.id.btnCallNext);

        btnCallBack.setOnClickListener(onClickCallBack);
        btnCallNext.setOnClickListener(onClickCallNext);

    }

}
