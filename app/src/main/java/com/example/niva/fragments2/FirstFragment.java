package com.example.niva.fragments2;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    ListView lv;
    ArrayList<String>titles=new ArrayList<String>();
    Context context;
    int pos;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first,container,false);
        lv=(ListView)view.findViewById(R.id.lv);
        titles.add("Apples");
        titles.add("Bananas");
        titles.add("Strawberries");
        titles.add("Peppers");

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,titles);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((MainActivity)getActivity()).updateSelectedRow(position);

            }
        });
        return view;
    }



}
