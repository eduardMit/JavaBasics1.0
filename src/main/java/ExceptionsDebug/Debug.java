package ExceptionsDebug;

import java.util.Scanner;

public class Debug {

    public static void main(String[] args) {

        int nr1;
        int nr2;
        int nr3 = 0;

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter the first nr");
        nr1 = scan1.nextInt();

        System.out.println("Enter the second nr");
        nr2 = scan1.nextInt();

        int sum = nr1 + nr2;
        System.out.println("The sum of " + nr1 + " & " + nr2 + " is " + sum);

    }

}
