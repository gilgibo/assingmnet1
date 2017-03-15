package com.example.gibo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    public EditText e3,e4;
    public Button b7,b8;

    public  void init() {
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year_1 = e3.getText().toString();
                int age_1 = 2017 - Integer.parseInt(year_1) + 1;
                Toast message_1 = Toast.makeText(getApplicationContext(), "당신의 나이는 "+age_1+"세 입니다.", Toast.LENGTH_SHORT);
                message_1.show();
            }
        });
        b8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String age_2 = e4.getText().toString();
                int year_2 = 2017 - Integer.parseInt(age_2) + 1;
                Toast message_2 = Toast.makeText(getApplicationContext(), "당신이 태어난 해는 "+year_2+"년 입니다.", Toast.LENGTH_SHORT);
                message_2.show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("나이 계산기");
        init();
    }
}
