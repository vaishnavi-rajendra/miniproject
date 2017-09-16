package com.rajendra.vaishnavi.miniproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class search extends Fragment implements View.OnClickListener{
    public Button button;








    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState){
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        button = (Button) inflater.inflate(R.layout.fragment_search, container, false).findViewById(R.id.btsearch);
        button.setOnClickListener(this);
        return inflater.inflate(R.layout.fragment_search, container, false);

    }
    @Override
    public void onClick (View v){
        Intent i = new Intent(getActivity(), searchpage.class);
        startActivity(i);
    }


}
