package com.example.android.droidcafeinput;

import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class StatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(StatusActivity.this);

        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage(getString(R.string.alert_message));
        myAlertBuilder.setPositiveButton(getString(R.string.alert_ok), (dialog, which) -> Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show());
        myAlertBuilder.setNegativeButton(getString(R.string.alert_cancel), (dialog, which) -> Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show());

        myAlertBuilder.show();
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.datepicker));
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        Toast.makeText(this, getString(R.string.date_text) + dateMessage, Toast.LENGTH_SHORT).show();
    }
}
