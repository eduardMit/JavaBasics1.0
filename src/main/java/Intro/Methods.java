package Intro;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        // 1. Existing methods:

        String title = "text";
        System.out.println(title.toUpperCase());

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first argument: ");
        String argument1 = scan.nextLine();
        System.out.println(argument1);

        // 2. Custom methods
       // print("123");
        // print("text", 12345, );
        sum(123, 3432);

        int [] grades = new int[3];
        grades[0] = 1;
        grades[1] = 5;
        grades[2] = 3;

        int sumArr = adding(grades);
        print("The sum of the array is " + sumArr);  // print("The sum of the array is ", sumArr);

        // Void method
        addText("St");

        String nextText = addText2("St");
        System.out.println(nextText.toUpperCase());
    }

    // Methods declarations

    static void print(String text) {       // static void print(String text, int nr)
        System.out.println(text);          // System.out.println(text + nr);
       // System.out.println(nr);
    }

    public static void sum(int nr1, int nr2){
        System.out.println(nr1 + nr2);
    }

    static int adding(int[] grade) {
        int addition = 0;
        for (int i=0; i<grade.length;i++){
            addition += grade[i];
        }
        return addition;
    }

    public static void addText(String st) {
        System.out.println(st + "ring 1");
    }

    public static String addText2(String st) {
        return st + "ring 2";
    }
}
