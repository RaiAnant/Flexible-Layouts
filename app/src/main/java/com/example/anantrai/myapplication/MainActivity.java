package com.example.anantrai.myapplication;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements BlankFragment.workoutListner{

    FrameLayout list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClickListner(long id) {
        FrameLayout frameLayout=findViewById(R.id.fragment_container);
        if(frameLayout!=null) {
            BlankFragment2 fragment2=new BlankFragment2();
            fragment2.setId(id);
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment2);
            //fragmentTransaction.addToBackStack(null); //this adds the fragment state to back stack so that on clicking back, it will load all the details desplayed by fragment previously,
            //on removing this line, the activity will end on clicking back button
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransaction.commit();
        }
    }
}

