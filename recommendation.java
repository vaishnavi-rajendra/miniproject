package com.rajendra.vaishnavi.miniproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.rajendra.vaishnavi.miniproject.datasource.datasource;

public class recommendation extends AppCompatActivity {


    datasource ds;
    String rev="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);
        Bundle bundle = getIntent().getExtras();
        String start = bundle.getString("user");
        ds=new datasource();
        rev=ds.getRev1(start);
        TextView t1=(TextView)findViewById(R.id.text1);
        if(rev.contains("temple")||rev.contains("devotional")||rev.contains("religious")||rev.contains("spiritual")||rev.contains("sacred")){
            t1.setText("We have found that you like to visit temples more.These are the further list of famous temples that you may like to visit again later.\n" +
                    "1)Siddaganga mutt \n2)Pavgada temple \n3)Madhugiri temple \n4)Kaidala \n5)Guluru \n6)Goravanahalli" );
        }
        else if(rev.contains("hills")|| rev.contains("trucking")||rev.contains("mountains")||rev.contains("summit")){
            t1.setText("We have found that you like to visit hills more.It seems that you like trucking.These are the further list of famous hills that you may like to visit again later.\n" +
                    "1)Siddara betta \n2)madhugiri monolithic hill \n3)Shivagange \n4)DD hills \n5)Siddaganga hills \n6)Hatyal Narasimha swami temple");
        }
        else if(rev.contains("historic")||rev.contains("history")||rev.contains("old")){
            t1.setText("We have found that you like to visit historic places more.These are the further list of famous historic places that you may like to visit again later.\n" +
                    "1)Madhugiri fort \n2)Kaidala \n 3)Namada Chilume");
        }
        else if(rev.contains("water")||rev.contains("amusement")||rev.contains("falls")){
            t1.setText("We have found that you like to visit places with water  more.These are the further list of places that you may like to visit again later.\n" +
                    "1)Gayathri jalashaya\n2)Marconhalli dam\n3) 4)Vanivilas sagar");
        }
        else if(rev.contains("wildlife")||rev.contains("animal")||rev.contains("birds")){
            t1.setText("We have found that you like to visit places with wildlife more.These are the further list of places that you may like to visit again later.\n" +
                    "1)NamadaChilume\n2)Jayamangali black buck reserve\n3)Kaggaladu wildlife\n4)Kunigal stud farm");
        }




    }
}
