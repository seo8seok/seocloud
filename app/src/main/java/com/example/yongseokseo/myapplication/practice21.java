package com.example.yongseokseo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class practice21 extends AppCompatActivity {

    private EditText mId;
    private EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice21);

        mId = (EditText) findViewById(R.id.ID_EditText);
        mPassword = (EditText) findViewById(R.id.ID_EditText);

    }
}
