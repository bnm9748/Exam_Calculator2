package com.example.exam_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mNum1,mNum2;
    TextView mResult;
    Button mReset;
    RadioGroup mGroup;
    RadioButton mPlus,mMinus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNum1 = findViewById(R.id.num1);
        mNum2 = findViewById(R.id.num2);
        mPlus = findViewById(R.id.plus);
        mMinus = findViewById(R.id.minus);
        mResult = findViewById(R.id.result);
        mReset = findViewById(R.id.reset);
        mPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int su1=Integer.parseInt(mNum1.getText().toString());
                int su2=Integer.parseInt(mNum2.getText().toString());
                int hap = su1+su2;
                mResult.setText(hap+"");
            }
        });
        mMinus.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View v) {
                int su1=Integer.parseInt(mNum1.getText().toString());
                int su2=Integer.parseInt(mNum2.getText().toString());
                mResult.setText(su1-su2+"");
            }
        });
        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNum1.setText(null);
                mNum2.setText(null);
                mResult.setText(null);
                Toast.makeText(MainActivity.this,"초기화",Toast.LENGTH_SHORT).show();
            }
        });


    }


}
