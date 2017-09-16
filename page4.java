package com.rajendra.vaishnavi.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rajendra.vaishnavi.miniproject.datasource.datasource;

public class page4 extends AppCompatActivity {
    datasource ds;
    page3 pg;
    String result="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);


        get();



    }

    private void get(){
        ds = new datasource();
        pg = new page3();
        Bundle bundle = getIntent().getExtras();
        final String start = bundle.getString("start");
        final String day = bundle.getString("day");
        final String username=bundle.getString("username");
        result=ds.fetch_db(start,day);
        String  res="please enter one of the valid start points given below\n1)mysore\n2)banglore";
        final TextView des=(TextView) findViewById(R.id.edtInput);
        if(result!=null){
            des.setText(result);
        }
        else {
            des.setText("please enter one of the valid start points given below\n1)mysore\n2)bangalore\n3)hassan\n4)davangere");
        }
        Button regiBut=(Button)findViewById(R.id.bregister);
        regiBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page4.this, interaction.class);
                intent.putExtra("start",start);
                intent.putExtra("day",day);

                startActivity(intent);
            }


        });
    }
}

