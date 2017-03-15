package com.example.gibo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    public EditText e7,e8,e9;
    public Button b11;
    public CheckBox c1;
    public TextView t11,t13;

    public void init(){

        e7 = (EditText)findViewById(R.id.editText7);
        e8 = (EditText)findViewById(R.id.editText8);
        e9 = (EditText)findViewById(R.id.editText9);
        b11 = (Button)findViewById(R.id.button11);
        c1 = (CheckBox) findViewById(R.id.checkBox);
        t11 = (TextView) findViewById(R.id.textView11);
        t13 = (TextView) findViewById(R.id.textView13);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e7.getText().toString().length() == 0) {
                    e7.setText("0");
                }
                if(e8.getText().toString().length() == 0) {
                    e8.setText("0");
                }
                if(e9.getText().toString().length() == 0) {
                    e9.setText("0");
                }

                String count_pizza = e7.getText().toString();
                String count_spaghetti = e8.getText().toString();
                String count_salad = e9.getText().toString();

                int total_count = Integer.parseInt(count_pizza)+Integer.parseInt(count_spaghetti)+Integer.parseInt(count_salad);
                int total_price = (Integer.parseInt(count_pizza) * 15000 + Integer.parseInt(count_spaghetti) * 13000 + Integer.parseInt(count_salad) * 9000);

                if(c1.isChecked()) {
                    total_price = Integer.parseInt(count_pizza) * 13500 + Integer.parseInt(count_spaghetti) * 11700 + Integer.parseInt(count_salad) * 8100;
                }
                t11.setText(Integer.toString(total_count)+"개");
                t13.setText(Integer.toString(total_price) +"원");

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("레스토랑 메뉴 주문");
        init();
    }
}
