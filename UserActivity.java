package com.krootoom.hds_register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {

    private Button btnUserBack;
    private View.OnClickListener onClickUser = new View.OnClickListener() {

        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), CallActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hds_register_user);

        btnUserBack = (Button) findViewById(R.id.btnUserBack);

        btnUserBack.setOnClickListener(onClickUser);

    }
}
