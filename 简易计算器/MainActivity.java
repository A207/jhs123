package com.example.administrator.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private  Button add;
    private Button min;
    private  Button mul;
    private  Button div;
    private TextView center;
    private EditText first;
    private EditText second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.jia);
        min = (Button) findViewById(R.id.jian);
        mul = (Button) findViewById(R.id.cheng);
        div = (Button) findViewById(R.id.chu);
        first=(EditText)findViewById(R.id.first);
        second=(EditText)findViewById(R.id.second);
        center=(TextView)findViewById(R.id.center);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double  result= Double.parseDouble(first.getText().toString())+ Double.parseDouble(second.getText().toString());
                center.setText(Double.toString(result));
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double  result=Double.parseDouble(first.getText().toString())- Double.parseDouble(second.getText().toString());
                center.setText(Double.toString(result));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = Double.parseDouble(first.getText().toString())*Double.parseDouble(second.getText().toString());
                center.setText(Double.toString(result));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = Double.parseDouble(first.getText().toString())/Double.parseDouble(second.getText().toString());
                center.setText(Double.toString(result));
            }
        });
    }
}
