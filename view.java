package com.rajendra.vaishnavi.miniproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.rajendra.vaishnavi.miniproject.datasource.datasource;

public class view extends AppCompatActivity {
String res1="",res2="",res3="";
    datasource ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        ds=new datasource();
        TextView t1=(TextView)findViewById(R.id.text1);
        TextView t2=(TextView)findViewById(R.id.text2);
        TextView t3=(TextView)findViewById(R.id.text3);
        res1= ds.getRev();
        String uname=res1.replaceAll("-"," ");
        t1.setText(uname);
        res2= ds.getRev();
        String uname1=res2.replaceAll("-"," ");
        t2.setText(uname1);
        res3= ds.getRev();
        String uname2=res3.replaceAll("-"," ");
        t3.setText(uname2);



    }


}
