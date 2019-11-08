package com.company;
import java.util.Objects;

public abstract class Human {

    public String name;
    public String surname;
    public float height;
    public float weight;
    boolean gender;

   public Human() {
        Human human = new Human;
    }


    static boolean talk() {
        return false;
    }

    static boolean tolerate(){
        return false;
    }

    static boolean togeter (){

        return false;
    }
   // static haveRelationship (Girl, Man) {}




    public Human(String name, String surname, float height, float weight, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }
}
