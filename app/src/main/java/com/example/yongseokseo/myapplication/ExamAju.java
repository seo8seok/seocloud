package com.example.yongseokseo.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class ExamAju extends AppCompatActivity implements View.OnClickListener {
    private TextView mId;
    private TextView mPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_aju);

        mId = (EditText) findViewById(R.id.ID);
        mPass = (EditText) findViewById(R.id.pass);
        findViewById(R.id.Login).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, chuluck.class );
        intent.putExtra("id", mId.getText().toString());
        intent.putExtra("passward", mPass.getText().toString());

    }
}

