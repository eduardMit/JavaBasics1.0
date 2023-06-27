package Encapsulation;

import java.awt.*;

public class Trainee {

    private String fullName;
    private String ID;

    public Trainee(String fullName, String ID){
        this.fullName = fullName;
        this.ID = ID;
    }


    public void setFullName(String newFullName){

        fullName = newFullName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setID(String newID) {

        ID = newID;

    }

    public String getID(){
        return ID;
    }



}
