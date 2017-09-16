package com.rajendra.vaishnavi.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        TextView t1=(TextView)findViewById(R.id.bregister);
        TextView t2=(TextView)findViewById(R.id.bregister1);
        TextView t3=(TextView)findViewById(R.id.bregister2);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hotel.this, hotel1.class);
                startActivity(intent);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hotel.this, hotel2.class);
                startActivity(intent);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hotel.this, hotel3.class);
                startActivity(intent);
            }
        });
    }
}
