package com.example.login;

import android.content.Intent;
import android.os.Bundle;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;

import android.view.View;
//import android.view.Menu;
//import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username,password;
    Button loginBtn, resetBtn;


    private void launchActivity() {

        Intent intent = new Intent(this, Add.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.userName);
        password = findViewById(R.id.userPassword);
        loginBtn = findViewById(R.id.loginButton);
        resetBtn = findViewById(R.id.resetButton);
        username.setText("");


        loginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Welcome Password Matched",Toast.LENGTH_LONG).show();
                    launchActivity();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Username/password Not Matched, recheck",Toast.LENGTH_LONG).show();
                }



            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                username.setText("");
                password.setText("");
                Toast.makeText(getApplicationContext(),"Fields cleared",Toast.LENGTH_LONG).show();
            }
        });


    }




}
