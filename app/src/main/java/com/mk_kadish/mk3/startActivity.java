package com.mk_kadish.mk3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class startActivity extends AppCompatActivity {

    private EditText UserName,UserPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        UserName=findViewById(R.id.user_name7);
        UserPassword=findViewById(R.id.user_password7);

    }

    public void MKloginUser(View view) {
        // readUsers(view);

        Intent intent = new Intent(this, userManagementActivity.class);
        startActivity(intent);

        String name=UserName.getText().toString();
        String password=UserPassword.getText().toString();



        if(name.equals(getResources().getString(R.string.user_name)) && password.equals(getResources().getString(R.string.user_password)))
        {
            Intent intent2= new Intent(this, userManagementActivity.class);
            startActivity(intent2);
           // finish();


            //startActivity(new Intent(this,userManagementActivity.class));
            //preferenceConfig.writeLoginStatus(true);
            // finish();
        }
        else
        {

            Toast.makeText(this,"Error Credentials....Try again", Toast.LENGTH_SHORT).show();
            UserName.setText("");
            UserPassword.setText("");
        }
    }
}
