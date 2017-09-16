package com.rajendra.vaishnavi.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;


import java.util.ArrayList;

public class searchpage extends AppCompatActivity implements SearchView.OnQueryTextListener {

    // Declare Variables
    ListView list;
    ListViewAdapter adapter;
    SearchView editsearch;
    String[] animalNameList;
    ArrayList<AnimalNames> arraylist = new ArrayList<AnimalNames>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchpage);

        // Generate sample data

        animalNameList = new String[]{"Shivagange","Siddaganga-mutt","Namada-Chilume","madhugiri-monolithic-hill","Channabasaveshwara-temple","Devarayana-durga"};

        // Locate the ListView in listview_main.xml
        list = (ListView)findViewById(R.id.listview);

        for (int i = 0; i < animalNameList.length; i++) {
            AnimalNames animalNames = new AnimalNames(animalNameList[i]);
            // Binds all strings into an array
            arraylist.add(animalNames);
        }

        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter(this, arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);

        // Locate the EditText in listview_main.xml
        editsearch = (SearchView)findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);
        Button b=(Button)findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SearchView search=(SearchView)findViewById(R.id.search);
                String start=search.getQuery().toString();
                Intent intent=new Intent(searchpage.this,display.class);
                intent.putExtra("start",start);
                startActivity(intent);
            }


        });

    }

    @Override
    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
    }
}