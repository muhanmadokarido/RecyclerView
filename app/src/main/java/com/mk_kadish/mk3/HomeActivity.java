package com.mk_kadish.mk3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private sharedPreferenceConfig preferenceConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        preferenceConfig=new sharedPreferenceConfig(getApplicationContext());
    }

    public void logOut(View view)
    {
        preferenceConfig.writeLoginStatus(false);
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    public void toUserManagement(View view)
    {
        startActivity(new Intent(this,userManagementActivity.class));
        finish();
    }
}
