package com.axciom.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.axciom.MainActivity;
import com.axciom.R;

public class Update extends AppCompatActivity {
    private AppCompatButton Logut ,UpdateBtn , HomeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        Logut = findViewById(R.id.logOutUpdate);
        UpdateBtn = findViewById(R.id.UpdateBtn);
        HomeBtn = findViewById(R.id.HomeBtn);
        Logut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        UpdateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Update.this, "Update SuccessFul", Toast.LENGTH_SHORT).show();
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