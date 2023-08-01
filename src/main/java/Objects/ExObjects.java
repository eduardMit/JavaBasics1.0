package Objects;

import java.time.LocalDate;

public class ExObjects {
    /*
    Create a "Student" class that has the following attributes:
    - First name
    - Last name
    - Year of birth
    - Phone number

    In the "ExObjects" class, create a student object
    Provide values for those attributes and print out: "Full name: first name & last name"
    Calculate his age with a method and print the result in the following format: "Age: (result of the calculation)"
    Print out the full phone number: "Phone number: 0xxxxxxxxx"
    */

    public static void main(String [] args){

        Student myEntry = new Student();

        myEntry.firstName = "Mircea";
        myEntry.lastName = "Voina";
        myEntry.birthYear = 1990;
        myEntry.number = "0749035459";
        //myEntry.phoneNr = 749035459l;


        System.out.println("Full name: " + myEntry.firstName + " " + myEntry.lastName);
        age(myEntry.birthYear);
        System.out.println("Phone number: " + myEntry.number);
        //System.out.println("Phone number: 0" + myEntry.phoneNr);
    }

    public static void age(int year){
        System.out.println("Age: " + (LocalDate.now().getYear() - year));
    }
}
