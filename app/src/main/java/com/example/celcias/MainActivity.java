package com.example.celcias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;
    double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button);
        b4=findViewById(R.id.button4);
        e1=findViewById(R.id.editTextTextPersonName3);
        e2=findViewById(R.id.editTextTextPersonName4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res=Double.parseDouble(String.valueOf(e1.getText()));
                Double result=res-32;
                Double r1=result*5/9;
                String r2=String.valueOf(r1);
                Toast.makeText(MainActivity.this,r2+"°C",Toast.LENGTH_SHORT).show();
                e2.setText(r2);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res=Double.parseDouble(String.valueOf(e1.getText()));
                Double result=res*9/5+32;
                String r1=String.valueOf(result);
                Toast.makeText(MainActivity.this,r1+"F",Toast.LENGTH_SHORT).show();
                e2.setText(r1);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res=Double.parseDouble(String.valueOf(e1.getText()));
                Double result=res/1000;
                String r1=String.valueOf(result);
                Toast.makeText(MainActivity.this,r1+"kg",Toast.LENGTH_SHORT).show();
                e2.setText(r1);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res=Double.parseDouble(String.valueOf(e1.getText()));
                Double result=res*1000;
                String r1=String.valueOf(result);
                Toast.makeText(MainActivity.this,r1+"gm",Toast.LENGTH_SHORT).show();
                e2.setText(r1);
            }
        });


    }
}