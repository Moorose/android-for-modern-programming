package com.example.drawabletest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mBatteryIndex;
    private ImageView mBatteryImage;
    static final String STATE_BATTERY = "state battery";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBatteryImage = (ImageView) findViewById(R.id.battery);

        if (savedInstanceState != null) {
            mBatteryIndex = savedInstanceState.getInt(STATE_BATTERY);
            mBatteryImage.setImageLevel(mBatteryIndex);
        } else {
            mBatteryIndex = 0;
            mBatteryImage.setImageLevel(mBatteryIndex);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(STATE_BATTERY, mBatteryIndex);
        super.onSaveInstanceState(outState);
    }

    public void changePower(View view) {
        switch (view.getId()) {
            case R.id.plus_btn:
                if (mBatteryIndex < 7) {
                    mBatteryIndex++;
                }
                break;
            case R.id.minus_btn:
                if (mBatteryIndex > 0) {
                    mBatteryIndex--;
                }
                break;
        }
        mBatteryImage.setImageLevel(mBatteryIndex);
    }
}
