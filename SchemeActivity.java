package com.krootoom.hds_register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SchemeActivity extends AppCompatActivity {

    private Button btnSchemeNext;
    private View.OnClickListener onClickName = new View.OnClickListener() {

        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), NameActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hds_register_scheme);

        btnSchemeNext = (Button) findViewById(R.id.btnSchemeNext);

        btnSchemeNext.setOnClickListener(onClickName);

    }
}
