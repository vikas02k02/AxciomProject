package com.axciom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.axciom.Admin.AdminHome;
import com.axciom.User.UserPortal;
import com.axciom.vendor.Homepage;

public class Authentication extends AppCompatActivity {
    private EditText userId , Password ;
    private Button cancel , Login ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        userId = findViewById(R.id.UserId);
        Password =findViewById(R.id.password);
        cancel = findViewById(R.id.cancelBtn);
        Login = findViewById(R.id.loginBtn);

        String role  = getIntent().getStringExtra("Role");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = userId.getText().toString();
                String pass = Password.getText().toString();
                if(role.equals("User")){
                    if(userName.equals("") && pass.equals("")){

                        Intent intent = new Intent(getApplicationContext() , UserPortal.class);
                        startActivity(intent);
                    }
                }else if ( role.equals("Admin")){
                    if(userName.equals("") && pass.equals("")){

                        Intent intent = new Intent(getApplicationContext() , AdminHome.class);
                        startActivity(intent);
                    }
                } else if (role.equals("Vendor")) {
                    if(userName.equals("") && pass.equals("")){

                        Intent intent = new Intent(getApplicationContext() , Homepage.class);
                        startActivity(intent);
                    }
                }

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}