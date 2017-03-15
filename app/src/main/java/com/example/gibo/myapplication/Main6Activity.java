package com.example.gibo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    public EditText e10,e11;
    public Button b12,b13,b14,b15;

    public void init(){

        e10 = (EditText)findViewById(R.id.editText10);
        e11 = (EditText)findViewById(R.id.editText11);
        b12 = (Button)findViewById(R.id.button12);
        b13 = (Button)findViewById(R.id.button13);
        b14 = (Button)findViewById(R.id.button14);
        b15 = (Button)findViewById(R.id.button15);

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number_1 = e10.getText().toString();
                String number_2 = e11.getText().toString();

                if(number_1.length() != 0 && number_2.length() != 0){

                    int addition = Integer.parseInt(number_1) + Integer.parseInt(number_2);

                    Toast message_addition = Toast.makeText(getApplicationContext(), "더하기 계산 결과는 "+addition+"입니다.", Toast.LENGTH_SHORT );
                    message_addition.show();
                }
                else {
                    Toast message_fault  = Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT );
                    message_fault.show();
                }
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number_1 = e10.getText().toString();
                String number_2 = e11.getText().toString();

                if(number_1.length() != 0 && number_2.length() != 0){

                    int subtraction = Integer.parseInt(number_1) - Integer.parseInt(number_2);

                    Toast message_subtraction = Toast.makeText(getApplicationContext(), "빼기 계산 결과는 "+subtraction+"입니다.", Toast.LENGTH_SHORT );
                    message_subtraction.show();
                }
                else {
                    Toast message_fault  = Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT );
                    message_fault.show();
                }
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number_1 = e10.getText().toString();
                String number_2 = e11.getText().toString();

                if(number_1.length() != 0 && number_2.length() != 0){

                    int multiplication = Integer.parseInt(number_1) * Integer.parseInt(number_2);

                    Toast message_multiplication = Toast.makeText(getApplicationContext(), "곱하기 계산 결과는 "+multiplication+"입니다.", Toast.LENGTH_SHORT );
                    message_multiplication.show();
                }
                else {
                    Toast message_fault  = Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT );
                    message_fault.show();
                }
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number_1 = e10.getText().toString();
                String number_2 = e11.getText().toString();

                if(number_1.length() != 0 && number_2.length() != 0){

                    int division = (int)(Integer.parseInt(number_1)/Integer.parseInt(number_2));

                    Toast message_division = Toast.makeText(getApplicationContext(), "나누기 계산 결과는 "+division+"입니다.", Toast.LENGTH_SHORT );
                    message_division.show();
                }
                else {
                    Toast message_fault  = Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT );
                    message_fault.show();
                }
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("계산기");
        init();
    }
}
