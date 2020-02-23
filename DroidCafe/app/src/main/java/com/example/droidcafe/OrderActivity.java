package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String message =  intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        if (message == null) message="Your order is empty";
        TextView textView = findViewById(R.id.order_textview);
        textView.setText("Order: " + message);
    }
}
