package Intro;
import java.util.Scanner;
public class ExMethod {

    // Write a program that requests the full name of the user, and prints it (in upper case) after the message "Hello, ", with the use of a method
        public static void main(String[] args) {
            Scanner scan2 = new Scanner(System.in);

            System.out.print("Enter your full name: ");
            String fullName = scan2.nextLine();

            printGreeting(fullName);
        }

        public static void printGreeting(String name) {
            System.out.println("Hello, " + name.toUpperCase());
        }
    }



