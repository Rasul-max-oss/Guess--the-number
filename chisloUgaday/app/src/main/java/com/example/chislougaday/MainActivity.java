package com.example.chislougaday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView predict;
    Button big, lit, eq;
    int left=1, right=1000, mid=(1+1000)/2;
    static  int count =0;
    String line;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        predict= findViewById(R.id.predict);
        line = "Ваше число больше, меньше, или равно -" +String.valueOf(mid)+ "?";
        predict.setText(line);
        big= findViewById(R.id.b);
        big.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                left= mid;
                mid = (left + right)/2;
                String pr ="Ваше число больше, меньше, или равно -" +String.valueOf(mid)+ "?";
                predict.setText(pr);
            }
        });
        lit= findViewById(R.id.lit);
        lit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                right = mid;
                mid = (right + left)/2;
                String pr =" число больше, меньше, или равно -" +String.valueOf(mid)+ "?";
                predict.setText(pr);
            }
        });
        eq= findViewById(R.id.eq);
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = "Я угадал число за " + count + " попыток.И это число: " + mid;
                predict.setText(res);
            }
        });

    }
    public void ClickRange(View view) {
        count=0;
        left=1;
        right=100;
        mid=(1+100)/2;
        line = " число больше, меньше, или равно -" +String.valueOf(mid)+ "?";
        predict.setText(line);
    }


    public void ClickRangeTwo(View view) {
        count=0;
        left=100;
        right=500;
        mid=(100+500)/2;
        line = " число больше, меньше, или равно -" +String.valueOf(mid)+ "?";
        predict.setText(line);
    }

    public void ClickRangeThree(View view) {
        count=0;
        left=500;
        right=1000;
        mid=(500+1000)/2;
        line = " число больше, меньше, или равно -" +String.valueOf(mid)+ "?";
        predict.setText(line);
    }
}