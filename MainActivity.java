package com.rajendra.vaishnavi.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rajendra.vaishnavi.miniproject.datasource.datasource;

public class MainActivity extends AppCompatActivity {
    TextView text;
    datasource ds;
    String result;
    String username;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        setContentView(R.layout.activity_main);
        ds = new datasource();
        TextView reg = (TextView) findViewById(R.id.tvRegisterLink);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, register2.class);
                startActivity(intent);
            }
        });

        Check();



    }



    public void Check() {

        final  EditText user = (EditText) findViewById(R.id.etUsername);
        final  EditText pass = (EditText) findViewById(R.id.etPassword);
        Button login = (Button) findViewById(R.id.bLogin);
        username=user.getText().toString();



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = ds.checkLogin(user.getText().toString(), pass.getText().toString());

                if (result.contains("y")) {
                    Intent intent = new Intent(MainActivity.this, page2.class);

                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Username & Password", Toast.LENGTH_SHORT).show();
                }

            }


        });

    }




}
