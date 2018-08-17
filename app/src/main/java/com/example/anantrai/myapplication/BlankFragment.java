package com.example.anantrai.myapplication;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }

    ListView listView;
    boolean mDualPane;

    public interface workoutListner{
       public void onClickListner(long id);
    }
    workoutListner listner;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            listner=(workoutListner)activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString()+" must impliment OnHeadlineSelectedListner");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        listView=(ListView)view.findViewById(R.id.list_view);
        String[] str=new String[4];
        for(int i=0;i<4;i++){
            str[i]=WorkoutDetails.workout[i].GetName();
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),R.layout.workout_name,R.id.workout_name,str);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                clickDetail(id);
            }
        });


        mDualPane=getActivity().getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE;
        if(mDualPane){
            clickDetail(0);
        }
        return view;
    }

    public void clickDetail(long id){
        if(!mDualPane){
            Intent intent=new Intent();
            intent.setClass(getActivity(),Main2Activity.class);
            intent.putExtra("ID",id);
            startActivity(intent);
        }
        else{
            listner.onClickListner(id);
        }
    }

}
