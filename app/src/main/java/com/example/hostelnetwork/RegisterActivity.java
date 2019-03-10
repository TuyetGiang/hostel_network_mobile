package com.example.hostelnetwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_register);
    }

//    public void goToLogin(View view) {
//        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
//        startActivity(intent);
//    }

    public void register(View view) {
    }

    public void closeRegister(View view) {
        Intent intent = new Intent(RegisterActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
