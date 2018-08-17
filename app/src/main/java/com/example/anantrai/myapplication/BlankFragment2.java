package com.example.anantrai.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    private long id;

    public void setId(long id){
        this.id=id;
    }



    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        TextView textView=(TextView)view.findViewById(R.id.workout_detail);
        textView.setText(WorkoutDetails.workout[(int)id].GetDetail());
        return view;
    }

}
