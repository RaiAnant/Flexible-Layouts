package com.example.anantrai.myapplication;

/**
 * Created by Anant Rai on 22-03-2018.
 */

public class WorkoutDetails {
    private String name;
    private String Detail;

    public final static WorkoutDetails[] workout={new WorkoutDetails("Pushups","Day1 25 \nDay2 30 \nDay3 25 "),
            new  WorkoutDetails("Pullups","Day1 15 \nDay2 18 \nDay3 20 "),
            new WorkoutDetails("Lifting","Day1 30 \nDay2 25 \nDay3 30 "),
            new WorkoutDetails("Jogging","Day1 2 rounds \nDay2 2.5 rounds \nDay3 2.5 rounds ")};

    public WorkoutDetails(String name, String Detail){
        this.name=name;
        this.Detail=Detail;
    }

    public String GetName(){
        return this.name;
    }

    public String GetDetail(){
        return this.Detail;
    }
}
