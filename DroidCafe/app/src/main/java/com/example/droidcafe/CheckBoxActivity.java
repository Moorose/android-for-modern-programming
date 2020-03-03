package com.example.droidcafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CheckBoxActivity extends AppCompatActivity {


    private ArrayList<CheckBox> checkBoxArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBoxArray = new ArrayList<CheckBox>();

//        checkBoxArray.add((CheckBox) findViewById(R.id.push_notofications_checkbox));
//        checkBoxArray.add((CheckBox) findViewById(R.id.sms_checkbox));
//        checkBoxArray.add((CheckBox) findViewById(R.id.mail_checkbox));
//        checkBoxArray.add((CheckBox) findViewById(R.id.phone_call_checkbox));
//        checkBoxArray.add((CheckBox) findViewById(R.id.carrier_pigeon_checkbox));
    }


    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void checkedCheckBox(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            checkBoxArray.add(checkBox);
        } else checkBoxArray.remove(checkBox);
    }

    public void showCheckBoxes(View view) {
        String message = (String) checkBoxArray.stream()
                .map(TextView::getText)
                .reduce((s1, s2) -> s1 + "," + s2)
                .orElse("");
        if (!message.isEmpty())
            displayToast(message);
    }
}
