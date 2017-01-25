package com.example.yongseokseo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mMinusButton;
    private Button mPlusButton;
    private TextView mQuantityTextView;
//수량
    private int mQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //초기화
        init();

        setContentView(R.layout.coffee);//레이아웃 표시
        // 레이아웃에서 특정 아이디를 인스턴스 변수와 연결
        mMinusButton = (Button) findViewById(R.id.minus);
        mPlusButton= (Button) findViewById(R.id.plus);
        mQuantityTextView= (TextView) findViewById(R.id.quantity);
        //수량


        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //debug
                Log.d(TAG, "click");
                //verbose
                Log.v(TAG, "일반로그");
                Log.i(TAG, "정보로그");
                Log.e(TAG, "에러로그");

                Log.w(TAG, "경고로그");
                //토스트 메세지
                Toast.makeText(MainActivity.this, "얼레이꼴래리", Toast.LENGTH_SHORT).show();
            }
        });







//        Button button = (Button) findViewById(R.id.btn);
//        button.setOnClickListener(this);
    }

    private void init() {
        mQuantity = 0;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "버튼을 클릭하쎳습니다 데헤헷", Toast.LENGTH_SHORT).show();
    }
}
