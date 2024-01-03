package com.axciom.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.axciom.MainActivity;
import com.axciom.R;

public class Cart extends AppCompatActivity {
    private AppCompatButton HomeBtn , LogOut , productStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        HomeBtn= findViewById(R.id.CartHomeBtn);
        LogOut = findViewById(R.id.CartLogOut);
        productStatus=findViewById(R.id.ProductStatus);
        productStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProductStatus.class);
                startActivity(intent);
            }
        });
        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), UserPortal.class);
                startActivity(intent);
            }
        });
    }

}