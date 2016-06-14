package com.example.niva.fragments2;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {

    FirstFragment f1;
    SecondFragment f2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        f1=(FirstFragment)fragmentManager.findFragmentById(R.id.fragment);
        f2=(SecondFragment)fragmentManager.findFragmentById(R.id.fragment2);

    }



    public void updateSelectedRow(int pos)
    {

        f2.updateSelectedRow(pos);
    }
}
