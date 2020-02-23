package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String mOrderMessage;
    public static final String EXTRA_MESSAGE = "com.example.droidcafe.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void donutOrder(View view) {
        mOrderMessage =getString(R.string.donut_order_message);
        displayToast(mOrderMessage);
    }

    public void iceCreamOreder(View view) {
        mOrderMessage =getString(R.string.ice_cream_order_message);
        displayToast(mOrderMessage);
    }

    public void froyoOrder(View view) {
        mOrderMessage =getString(R.string.froyo_order_message);
        displayToast(mOrderMessage);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
        startActivity(intent);
    }
}
