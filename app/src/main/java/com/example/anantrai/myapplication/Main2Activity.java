package com.example.anantrai.myapplication;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(Configuration.ORIENTATION_LANDSCAPE==getResources().getConfiguration().orientation){
            finish();
            return;
        }
        else{
            BlankFragment2 fragment=new BlankFragment2();
            Intent intent=getIntent();
            fragment.setId(intent.getLongExtra("ID",0));
            FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.add(R.id.detail_fragment,fragment);
            ft.commit();
        }
    }
}
