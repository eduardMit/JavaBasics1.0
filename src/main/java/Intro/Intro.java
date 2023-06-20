package Intro;

import java.util.Scanner;

import static Intro.Methods.sum;


public class Intro {

    public static void main(String[] args) {
        // One line comment

        /*
        multiple line comment
        */

        System.out.println("Hello");

        Scanner input1 = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = input1.next();
        System.out.println("Welcome " + name);

        System.out.println("Text with a quote \"quote\"");
        System.out.println("Location is C:\\Users");
        System.out.println("Location is \n C:\\Users");

        sum(2,5);

    }

}
