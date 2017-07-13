package com.example.a5ways;

/**
 * Created by kyripapa on 13/6/2017.
 */

public class Choices {
    int id;
    String date;
    String category;
    String type;
    String chosen;
    String frequency;
    String time;

    public Choices(){   }
    public Choices(int id, String date, String category, String type, String chosen, String frequency, String time){
        this.id = id;
        this.date = date;
        this.category = category;
        this.type = type;
        this.chosen = chosen;
        this.frequency = frequency;
        this.time = time;
    }

    public Choices(String date, String category, String type, String chosen, String frequency, String time){
        this.date = date;
        this.category = category;
        this.type = type;
        this.chosen = chosen;
        this.frequency = frequency;
        this.time = time;

    }
    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getDate(){
        return this.date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }
    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getChosen(){
        return this.chosen;
    }

    public void setChosen(String chosen){
        this.chosen = chosen;
    }

    public String getFrequency(){
        return this.frequency;
    }

    public void setFrequency(String frequency){
        this.frequency = frequency;
    }
 public String getTime(){
        return this.time;
    }

    public void setTime(String time){
        this.time = time;
    }
}