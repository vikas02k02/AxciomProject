package com.axciom.Admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.axciom.MainActivity;
import com.axciom.R;
import com.axciom.User.Cart;

import java.util.function.LongFunction;

public class AdminHome extends AppCompatActivity {
    private AppCompatButton LogOutAdmin , MaintainUser ,MaintainVendor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        LogOutAdmin = findViewById(R.id.LogOutAdmin);
        MaintainUser =findViewById(R.id.maintainUser);
        MaintainVendor=findViewById(R.id.maintainVendor);
        LogOutAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        MaintainVendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MaintainVendor.class);
                startActivity(intent);
            }
        });
        MaintainUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MaintainUser.class);
                startActivity(intent);
            }
        });
    }
}