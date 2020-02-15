package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(LOG_TAG, "Method onCreate from MainActivity was called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "TextView was initialized");
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
        Log.i(LOG_TAG, "Toast was presented");
    }

    public void countUp(View view) {
        ++mCount;
        Log.d(LOG_TAG, "Count = " + mCount);
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void countZero(View view) {
        mCount = 0;
        Log.d(LOG_TAG, "Count = " + mCount);
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
