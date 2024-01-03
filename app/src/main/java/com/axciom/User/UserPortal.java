package com.axciom.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.axciom.MainActivity;
import com.axciom.R;

import java.util.ArrayList;

public class UserPortal extends AppCompatActivity {
    private Spinner vendorDrop;
    private AppCompatButton logOut , OrderStatus , cart ,guestList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_portal);
        vendorDrop = findViewById(R.id.VendorDrop);
        logOut = findViewById(R.id.UserLogOut);
        OrderStatus = findViewById(R.id.orderStatus);
        cart = findViewById(R.id.UserCart);
        guestList=findViewById(R.id.UserGuestList);

        guestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Update.class);
                startActivity(intent);
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Cart.class);
                startActivity(intent);
            }
        });

        OrderStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ArrayList<String> item = new ArrayList<>();
        item.add("Catering");
        item.add("Florist");
        item.add("Decoration");
        item.add("Lighting");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(),R.layout.drop,R.id.dropItem,item);
        vendorDrop.setAdapter(arrayAdapter);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}