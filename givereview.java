package com.rajendra.vaishnavi.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rajendra.vaishnavi.miniproject.datasource.datasource;

public class givereview extends AppCompatActivity {
    String review = "";


    datasource ds;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_givereview);


        ds = new datasource();
        Check();



    }

    private void Check() {

        Button login = (Button) findViewById(R.id.bLogin);
        final EditText email=(EditText)findViewById(R.id.ruser);
        final EditText user=(EditText)findViewById(R.id.reviewarea);
        Button login1=(Button)findViewById(R.id.bLogin1);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 ds.recommend(email.getText().toString(), user.getText().toString());
                Toast.makeText(givereview.this,"Thanks for the review", Toast.LENGTH_SHORT).show();


            }


        });
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(givereview.this,recommendation.class);
                intent.putExtra("user",email.getText().toString());


                startActivity(intent);


            }


        });

    }


}
