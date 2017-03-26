package com.krootoom.hds_register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NameActivity extends AppCompatActivity {

    private Button btnNameBack;
    private Button btnNameNext;
    private View.OnClickListener onClickNameBack = new View.OnClickListener() {

        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), SchemeActivity.class);
            startActivity(i);
        }
    };
    private View.OnClickListener onClickNameNext = new View.OnClickListener() {

        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), CallActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hds_register_name);

        btnNameBack = (Button) findViewById(R.id.btnNameBack);
        btnNameNext = (Button) findViewById(R.id.btnNameNext);

        btnNameBack.setOnClickListener(onClickNameBack);
        btnNameNext.setOnClickListener(onClickNameNext);

    }
}

