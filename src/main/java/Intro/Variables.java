package Intro;

public class Variables {

    static final int MAX_NR = 100;

    public static void main(String[] args) {
        /* Data Types

           1. Primitive

             - byte
             - short
             - int
             - long
             - float
             - double
             - char
             - boolean

           2. Non-Primitive - Reference Type

             - String
             - Arrays
             - Classes
             - Interfaces
             etc.

           3. Type Casting
    */

        // 1. Primitive Data Types

        // Byte, Short, Int (Whole numbers, without decimal points):

        byte b1 = 0;
        short s1 = 10;
        int i3 = 999999999;
        int i4 = -500, i5 =33;

        System.out.println(i3);
        System.out.println(s1 + i4);
        System.out.println(s1 * i4);


        long l1 = 999999999999999L;
        float f1 = 2.5F;
        double d1 = 99999.44;

        char c1 = 'c';

        boolean bl1 = true;

        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(c1);
        System.out.println(bl1);
        System.out.println("Suma: " + s1 + bl1);

        // 2. Non-primitive:

        String str1 = "This is a string";
        str1 = "This is the same variable";
        System.out.println(str1);
        System.out.println(str1.toUpperCase());

        //final int MAX_NR = 100;
        //MAX_NR = 110;
        System.out.println(MAX_NR);

        // 3. Type Casting

        // Widening

        int myInt1 = 5;
        double myDouble = myInt1;   // Automatic casting: int to double

        System.out.println(myInt1);
        System.out.println(myDouble);

        // Narrowing

        double myDouble2 = 5.25d;
        int myInt2 = (int) myDouble2;   // Manual casting: double to int

        System.out.println(myDouble2);
        System.out.println(myInt2);
    }
}
