package com.axciom.Admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.axciom.MainActivity;
import com.axciom.R;

public class MaintainUser extends AppCompatActivity {
        private AppCompatButton maintanUser , maintainVendor , LogOutAdmin ,HomeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintain_user);
        maintainVendor = findViewById(R.id.maintainVendor);
        maintanUser = findViewById(R.id.maintainUser);
        LogOutAdmin = findViewById(R.id.LogOutAdmin);
        maintanUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , MaintainUser.class);
                startActivity(intent);
            }
        });

        maintainVendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(getApplicationContext() , MaintainVendor.class);
                startActivity(intent);
            }
        });

        LogOutAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        HomeBtn = findViewById(R.id.HomeAdmin);
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AdminHome.class);
                startActivity(intent);
            }
        });




    }
}