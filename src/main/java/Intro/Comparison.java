package Intro;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

        // Operators are used to perform operations on variables and values

        // 1. Arithmetic operators
        // 2. Assignment operators
        // 3. Comparison operators
        // 4. Conditional operators - Logical & Ternary

        // 1. Arithmetic Operators

        /*
            +	Addition
            -	Subtraction
            *	Multiplication
            /	Division
            %	Modulus	Returns the division remainder
            ++	Increment	Increases the value of a variable by 1
            --	Decrement	Decreases the value of a variable by 1
         */

        int res = 1 + 2;
        System.out.println("Result is: " + res);
        System.out.println("Another result is: " + 1 + 2);

        int nr = 4;
        ++nr;
        System.out.println(nr);

        // 2. Assignment operators

        /*
            =
            +=
            -=
            *=
            /=
            %=
        */

        int a = 1;
        int b = 2;

        //a = a + b;
        a += b;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        // 3. Comparison Operators:

        /*
            8 > 9;
            8 < 9;
            8 >= 9;
            8 <= 9;
            8 == 9;
            8 != 9;
        */

        int val1 = 8;
        int val2 = 9;

        boolean b1 = (val1 == val2);
        System.out.println(b1);
        System.out.println(val1 != val2);

        // Comparison Operators with If Statements

        int val3 = 12;

        if (val3 == 12) {
            System.out.println("Comparison is true");
        }

        // 4. Conditional operators
        // 4.1 Logical Operators - OR, AND, NOT

        // || - OR

        if (val3 == 9 || val3 == 12){
            System.out.println("One match is found");
        }

        // && - AND

        if (val3 >= 9 && val3 <= 12){
            System.out.println("Value is between 9 and 13");
        }

        // ! - NOT
        Scanner scan = new Scanner(System.in);
        System.out.println("To log out of your account, press y or Y");
        String input = scan.next();

        if(!input.equals("y") && !input.equals("Y")) {
            System.out.println("You are still logged in");
        }
        else {
            System.out.println("You have successfully logged out");
        }

        // 4.2 Ternary Operator

        int x = (5 == 6) ? 5 : 2;
        String str = (5 > 2) ? "Statement true" : "Statement false";

        System.out.println(x);
        System.out.println(str);

    }

}
