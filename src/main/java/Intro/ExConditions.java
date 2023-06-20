package Intro;

import java.util.Scanner;

public class ExConditions {

    /*
    Write a program that accepts a test grade and prints out the following statements:
    - "Insufficient" if the grade is less than 5
    - "Sufficient" if the grade is between 5 and 6
    - "Good" if the grade is greater than 6 and smaller than 9
    - "Very good" if the grade is greater than 8
    */

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter your test grade");

        int grade = scan1.nextInt();

        if(grade < 5 ) {
            System.out.println("Insufficient");
        }else if (grade >= 5 && grade <= 6){
            System.out.println("Sufficient");
        }else if (grade > 6 && grade < 9){
            System.out.println("Good");
        }else {
            System.out.println("Very good");
        }
    }
}
