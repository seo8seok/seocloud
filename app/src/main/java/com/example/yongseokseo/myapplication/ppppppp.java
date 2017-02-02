package com.example.yongseokseo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ppppppp extends AppCompatActivity implements View.OnClickListener {


    public static final int REQUEST_CODE = 1000;
    private EditText mIdEditText;
    private EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppppppp);

        mIdEditText = (EditText) findViewById(R.id.ID_EditText);
        mPasswordEditText = (EditText) findViewById(R.id.Password_EditText);

        findViewById(R.id.Login_Button).setOnClickListener(this);




    }
    //할일
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this , pp.class );
        intent.putExtra("id", mIdEditText.getText().toString());
        intent.putExtra("pass", mPasswordEditText.getText().toString());

        startActivityForResult(intent, REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE
                );
    }
}
