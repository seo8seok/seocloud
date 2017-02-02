package com.example.yongseokseo.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Random;

public class Lotto extends AppCompatActivity {

    private Button mBtCreate;
    private EditText mEtA;
    private EditText mEtB;
    private EditText mEtC;
    private EditText mEtD;
    private EditText mEtE;
    private Button mBtReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto);

        mBtCreate = (Button) findViewById(R.id.lotto_NumCreate);
        mBtReset = (Button) findViewById(R.id.lotto_Bt_Reset);



        mEtA = (EditText) findViewById(R.id.lotto_A);
        mEtB = (EditText) findViewById(R.id.lotto_B);
        mEtC = (EditText) findViewById(R.id.lotto_C);
        mEtD = (EditText) findViewById(R.id.lotto_D);
        mEtE = (EditText) findViewById(R.id.lotto_E);


        mBtReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEtA.setText("");
                mEtB.setText("");
                mEtC.setText("");
                mEtD.setText("");
                mEtE.setText("");


            }
        });

        mBtCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //할것
                mEtA.setText(create_lotto());
                mEtB.setText(create_lotto());
                mEtC.setText(create_lotto());
                mEtD.setText(create_lotto());
                mEtE.setText(create_lotto());



            }
        });

    }

    @NonNull
    private String create_lotto() {
        int[] lot = new int[6];
        String s = "";


        for (int i = 0; i < 6; i++) {
            lot[i] = (new Random().nextInt(45)) + 1;

            for (int j = 0; j < i; j++) {
                if (lot[i] == lot[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < lot.length; i++) {
            s = s + lot[i] + " ";


        }
        return s;
    }


}
