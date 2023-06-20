package Intro;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        /*
        float f1 = 2.5F;
        boolean b3 = (f1 < 3);

        // If statement

        if(true){
            System.out.println("Statement is true");
        }

        if(b3){
            System.out.println("Statement is true");
        }


        // If Else

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter your age");

        int age = scan1.nextInt();
        System.out.println("You are " + age);

        if(age >= 18){
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // Else If statement:
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter your username");

        String user = scan2.next();
        int nr = user.length();

        if(nr >= 0 && nr <= 5){
            System.out.println("Username too short");
        } else if (nr >= 6 && nr <= 10) {
            System.out.println("Welcome back " + user);
        } else {
            System.out.println("Username too long");
        }
        */
        // Switch case
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter the number of the module from the list, for more info:");

        System.out.println("Module 1: Agile \n" +
                            "Module 2: Data Visualisation \n" +
                            "Module 3: Version Control \n" +
                            "Module 4: Java \n" +
                            "Module 5: Python \n" +
                            "Module 6: Testing \n" +
                            "Module 7: API"
        );

        int Module = scan3.nextInt();

        switch (Module) {
            case 1:
                System.out.println("Module nr. " + Module + " id Agile, from 24.04 to 09.05");
                break;
            case 2:
                System.out.println("Module nr. " + Module + " id Data Visualisation, from 17.05 to 23.05");
                break;
            case 3:
                System.out.println("Module nr." + Module + " is Version Control, from 29.05 to 06.06");
                break;
            case 4:
                System.out.println("Module nr." + Module + " is Java, from 12.06 to 04.07");
                break;
            case 5:
                System.out.println("Module nr." + Module + " is Python, from 10.07 to 15.08");
                break;
            case 6:
                System.out.println("Module nr." + Module + " is Testing, from 04.09 to 12.09");
                break;
            case 7:
                System.out.println("Module nr." + Module + " is API, from 18.09 to 26.09");
                break;
            default:
                System.out.println("Unknown module");
        }

    /*
    Write a program that accepts a test grade and prints out the following statements:
    - "Insufficient" if the grade is less than 5
    - "Sufficient" if the grade is between 5 and 6
    - "Good" if the grade is greater than 6 and smaller than 9
    - "Very good" if the grade is greater than 8
    */

    }
}
