package com.axciom.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.axciom.Authentication;
import com.axciom.MainActivity;
import com.axciom.R;

import java.util.ArrayList;

public class UserSignUp extends AppCompatActivity {
    private Spinner category ;
    private AppCompatButton signUp , back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);
        category = findViewById(R.id.category);
        signUp =findViewById(R.id.UserSignUp);
        back = findViewById(R.id.Userback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        ArrayList<String> cat = new ArrayList<>();
        cat.add("Catering");
        cat.add("Florist");
        cat.add("Decoration");
        cat.add("Lighting");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(),R.layout.drop,R.id.dropItem,cat);
        category.setAdapter(arrayAdapter);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(getApplicationContext(), UserPortal.class);
                startActivity(intent);
                finish();
            }
        });

    }
}