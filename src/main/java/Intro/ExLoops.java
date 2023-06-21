package Intro;
import java.util.Scanner;
public class ExLoops {

     /*
       Write a program that requests the user to input a password and compare it to an existing password: P@ssword0
       Define and assign yourself this existing password, in your program
       If they are different, print "Incorrect password. Please try again" until the correct answer is introduced
       If they are not different, print "Login successful"
    */
        public static void main(String[] args) {
            String Password = "Aluna";
            Scanner scan1 = new Scanner(System.in);

            while (true) {
                System.out.print("Enter password: ");
                String password = scan1.nextLine();

                if (password.equals(Password)) {
                    System.out.println("Login successful");
                    break;
                } else {
                    System.out.println("Incorrect password. Please try again");
                }
            }
        }
    }



