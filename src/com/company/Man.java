package com.company;

public class Man extends Human {

    Boolean gender =true;

    public Man(String name, String surname, float height, float weight, boolean gender, Boolean gender1) {
        super(name, surname, height, weight, gender);
        this.gender = gender1;
    }

    //  Man man = new Man (name: "Boris", String surname, float height, float weight, gender:true){
     // super(); // ыызываем констурктор из Human

    }



