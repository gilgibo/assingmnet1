package com.example.gibo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    public EditText e1,e2;
    public Button b6;

    public void init(){
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        b6 = (Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String price = e1.getText().toString();
                String count = e2.getText().toString();

                int total = Integer.parseInt(price) * Integer.parseInt(count);

                Toast message =  Toast.makeText(getApplicationContext() , "사과의 가격은 "+total+"원 입니다." , Toast.LENGTH_SHORT);

                message.show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("사과 계산");
        init();
    }
}
