package com.mk_kadish.mk3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MKLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mklogin);
    }

    public void MKloginUser(View view) {

        startActivity(new Intent(this,userManagementActivity.class));
        finish();
    }
}
