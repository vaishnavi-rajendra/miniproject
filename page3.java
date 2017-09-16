package com.rajendra.vaishnavi.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rajendra.vaishnavi.miniproject.datasource.datasource;

public class page3 extends AppCompatActivity {

    String result="";
    datasource ds;
    String start,day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        ds=new datasource();

        Button okay=(Button)findViewById(R.id.bok);
       final EditText start_point = (EditText) findViewById(R.id.etentry);
        final EditText no_of_days = (EditText) findViewById(R.id.etday);
        Bundle bundle = getIntent().getExtras();

        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start=start_point.getText().toString();
                day=no_of_days.getText().toString();
                Intent intent=new Intent(page3.this,page4.class);
                intent.putExtra("start",start);
                intent.putExtra("day",day);

                startActivity(intent);
            }


        });




    }

}