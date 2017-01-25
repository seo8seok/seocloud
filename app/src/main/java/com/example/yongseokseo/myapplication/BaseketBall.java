package com.example.yongseokseo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BaseketBall extends AppCompatActivity {
    private Button TA3;
    private Button TA2;
    private Button TA1;
    private Button TB3;
    private Button TB2;
    private Button TB1;

    private Button Reset;

    private TextView AS;
    private TextView BS;

    private int ascore=0;
    private int bscore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseket_ball);
        TA3=(Button)findViewById(R.id.Point3A);
        TA2=(Button)findViewById(R.id.Point2A);
        TA1=(Button)findViewById(R.id.FreePointA);
        TB3=(Button)findViewById(R.id.Point3B);
        TB2=(Button)findViewById(R.id.Point2B);
        TB1=(Button)findViewById(R.id.FreePointB);

        Reset=(Button)findViewById(R.id.Reset);

        AS=(TextView)findViewById(R.id.ScoreA);
        BS=(TextView)findViewById(R.id.ScoreB);

        TA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ascore += 3;
                AS.setText(""+ascore);
            }
        });

        TA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ascore += 2;
                AS.setText(""+ascore);
            }
        });

        TA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ascore += 1;
                AS.setText(""+ascore);
            }
        });
        TB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bscore += 3;
                BS.setText(""+bscore);
            }
        });
        TB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bscore +=2;
                BS.setText(""+bscore);
            }
        });

        TB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bscore +=1;
                BS.setText(""+bscore);
            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ascore=0;
                bscore=0;

                BS.setText(""+bscore);
                AS.setText(""+ascore);
            }
        });



    }

}
