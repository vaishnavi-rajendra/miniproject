package com.rajendra.vaishnavi.miniproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.rajendra.vaishnavi.miniproject.datasource.datasource;

public class display extends AppCompatActivity {
    datasource ds;
    String result="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Bundle bundle = getIntent().getExtras();
        final String start = bundle.getString("start");
        ds = new datasource();
        TextView t1=(TextView)findViewById(R.id.text1);

        result = ds.image(start);
        t1.setText(result);




    }


}
