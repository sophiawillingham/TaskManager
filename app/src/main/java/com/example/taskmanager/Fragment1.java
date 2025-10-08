package com.example.taskmanager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,  //use the inflater to create my layout
                             ViewGroup container, //parent layout the UI will go into
                             Bundle savedInstanceState){ //saving and restoring data

        //inflate(XML layout file,parent layout, boolean attachToRoot, switch)
        View view = inflater.inflate(R.layout.fragment_f1, container, false);

        //calls add task method when button is pressed
        return view;
    }

}
