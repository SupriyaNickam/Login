package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Add extends AppCompatActivity {

    EditText firstDigit, secondDigit;
    Button addBtn, resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        firstDigit = findViewById(R.id.firstDigit);
        secondDigit = findViewById(R.id.secondDigit);
        addBtn = findViewById(R.id.addButton);
        resetBtn = findViewById(R.id.resetButton);

        addBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                String numberOne = firstDigit.getText().toString();
                String numberTwo = secondDigit.getText().toString();

                if(TextUtils.isEmpty(numberOne) || TextUtils.isEmpty(numberTwo)){
                    Toast.makeText(getApplicationContext(),"Please enter both fields",Toast.LENGTH_LONG).show();

                }
                else{
                    int sum = Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);
                    Toast.makeText(getApplicationContext(),"Total is:"+sum,Toast.LENGTH_LONG).show();
                }



            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                firstDigit.setText("");
                secondDigit.setText("");
                Toast.makeText(getApplicationContext(),"Fields cleared",Toast.LENGTH_LONG).show();
            }
        });

    }
}