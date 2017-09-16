package com.rajendra.vaishnavi.miniproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rajendra.vaishnavi.miniproject.datasource.datasource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class register2 extends AppCompatActivity {
    datasource ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        ds=new datasource();
        initGUI();
    }

    private void initGUI(){
        final EditText email=(EditText)findViewById(R.id.etmail);

        final EditText user=(EditText)findViewById(R.id.etUsername);
        final EditText pass=(EditText)findViewById(R.id.etPassword);
        final EditText country=(EditText)findViewById(R.id.etcountry);
        Button regiBut=(Button)findViewById(R.id.bregister);
        regiBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isEditTextContainEmail(email)){
                    Toast.makeText(getApplicationContext(),"invalid emailid",Toast.LENGTH_LONG).show();
                }
                else{
                ds.getValueRegistration(email.getText().toString(),user.getText().toString(),pass.getText().toString(),country.getText().toString());
                Toast.makeText(getApplicationContext(),"your registration done successfully",Toast.LENGTH_LONG).show();
            }}
        });

    }
    public static boolean isEditTextContainEmail(EditText argEditText) {

        try {
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher matcher = pattern.matcher(argEditText.getText());
            return matcher.matches();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
