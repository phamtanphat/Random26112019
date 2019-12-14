package com.example.random26112019;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEdtMin, mEdtMax;
    Button mBtnRandom;
    TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ctrl + .
//        0.1 * 5 = 0.5
//        0.2 * 5= 1
//        0.9 * 5 = 4.5
//        double random = Math.random() * 5;
        // Lam tron gia tri
//        double number1 = Math.round(random);
        //Lam tron len
//        double number2 = Math.ceil(random);
        //Lam tron xuong
//        double number2 = Math.floor(random);
//        Log.d("BBB",String.valueOf(random));
//        Log.d("BBB",String.valueOf(number2));
//        int a = 5;
//        int b = 10;
//        int ketqua = Math.max(a , b);
//        Log.d("BBB",String.valueOf(ketqua));
//      5 - 303
//
//        Random random = new Random();
//        int numberRandom = random.nextInt(303 - 5 + 1) + 5;
//        Log.d("BBB",String.valueOf(numberRandom));

//        Random random = new Random();
//        int red = random.nextInt(256);
//        int green = random.nextInt(256);
//        int blue = random.nextInt(256);
        //123456789abcdef => 6 gia tri
//        relativeLayout.setBackgroundColor(Color.rgb(red,green,blue));
        mEdtMin = findViewById(R.id.edtMin);
        mEdtMax = findViewById(R.id.edtMax);
        mBtnRandom = findViewById(R.id.btnRandom);
        mTvResult = findViewById(R.id.txtResult);

        // Task 1 : Lấy dữ liệu trong edittext
        // Task 2 : Xem sự kiện click của button
        // Task 3 : Khi Click button show ra dữ trong edittext

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textMin = mEdtMin.getText().toString().trim();
                String textMax = mEdtMax.getText().toString().trim();


                if (textMin.isEmpty() | textMax.isEmpty()){
                    Toast.makeText(MainActivity.this, "Ban hay du thong tin!!", Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer sMin = Integer.valueOf(textMin);
                Integer sMax = Integer.valueOf(textMax);

                Random random = new Random();
                int value = random.nextInt(sMax - sMin + 1) + sMin;

                mTvResult.setText(String.valueOf(value));
            }
        });

    }
}
