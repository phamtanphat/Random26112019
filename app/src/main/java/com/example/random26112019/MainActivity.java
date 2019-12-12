package com.example.random26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
//      5 - 10
        Random random = new Random();
        int numberRandom = random.nextInt();
        Log.d("BBB",String.valueOf(numberRandom));

    }
}
