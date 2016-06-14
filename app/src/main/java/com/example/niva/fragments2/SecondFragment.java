package com.example.niva.fragments2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    String[]contents=new String[4];
    TextView tv;
    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    
        contents[0]="Apples";
        contents[1]="Bananas";
        contents[2]="Strawberries";
        contents[3]="Peppers";

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        tv=(TextView)view.findViewById(R.id.tv);

        return view;//inflater.inflate(R.layout.fragment_second, container, false);
    }


    public void updateSelectedRow(int row)
    {
       tv.setText(contents[row]);
    }



}
