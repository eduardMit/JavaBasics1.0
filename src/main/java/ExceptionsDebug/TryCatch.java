package ExceptionsDebug;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class TryCatch {

    public static void main(String[] args) {
        // Ex.1
        // Exception caused by the empty index number
        /*
        int [] ar1 = {1,2,3};
        System.out.println(ar1[3]);
        */

        try{
            int [] ar1 = {1,2,3};
            System.out.println(ar1[2]);

        } catch (Exception e) {
            System.out.println("No value for that index");
        }

        // Ex.2 - NullPointerException
        try{
            int [] ar2 = null;
            System.out.println(ar2[1]);
        } catch (NullPointerException e) {
            System.out.println("The array is null");
        }

        // Ex.3 - Divide by 0
        Scanner scan1 = new Scanner(System.in);
        int div;
        try {
            System.out.println("Enter the first number");
            int nr1 = scan1.nextInt();
            System.out.println("Enter the second number");
            int nr2 = scan1.nextInt();

            div = nr1 / nr2;
            System.out.println(div);
        } catch (Exception e) {
            System.out.println("Can't divide by 0");
        } finally {
            System.out.println("End of the execution");
        }
        // scan1.close();

        // Ex.4 - Custom Exception
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter your password");
        String pw = scan2.nextLine();
        try {
            checkPw(pw);
        } catch (Exception e){
            System.out.println(e);
        }

    }
    static void checkPw(String pw) throws CustomException{
        if (pw.equals("Password1")) {
            System.out.println("Access granted");       // throw new CustomException("Access granted");
        }
        else {
            throw new CustomException("Access denied"); // System.out.println("Access denied");
        }
    }

}
