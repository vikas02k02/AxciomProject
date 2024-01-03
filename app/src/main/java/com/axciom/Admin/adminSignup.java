package com.axciom.Admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.axciom.R;
import com.axciom.User.UserPortal;

import java.util.ArrayList;

public class adminSignup extends AppCompatActivity {
    private AppCompatButton SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_signup);

        SignUp= findViewById(R.id.SignUp);


        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AdminHome.class);
                startActivity(intent);
                finish();
            }
        });
    }
}