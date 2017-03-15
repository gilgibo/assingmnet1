package com.example.gibo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    public EditText e5,e6;
    public Button b9,b10;

    public void init(){
        e5 = (EditText)findViewById(R.id.editText5);
        e6 = (EditText)findViewById(R.id.editText6);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_temperature_1 = e5.getText().toString();
                double temperature_1 = Integer.parseInt(str_temperature_1)*1.8 + 32;
                Toast message_1 = Toast.makeText(getApplicationContext(), "화씨 온도는 "+temperature_1+"도 입니다.", Toast.LENGTH_SHORT);
                message_1.show();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_temperature_2 = e6.getText().toString();
                double  temperature_2 = (Integer.parseInt(str_temperature_2) - 32)/1.8;
                Toast message_2 = Toast.makeText(getApplicationContext(), "섭씨 온도는 "+temperature_2+"도 입니다.", Toast.LENGTH_SHORT);
                message_2.show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("온도 변환기");
        init();
    }
}
