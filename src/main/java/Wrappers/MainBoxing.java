package Wrappers;

public class MainBoxing {
    // Wrapper class:
    // Use Primitive data types as Reference data types
    // Reference Data Types contain methods
    // They can be used with Collections like ArrayList

    public static void main(String[] args) {
        Boolean B = true;
        Character C = '$';
        Integer I = 0123;
        Double D = 2.5;
        String S = "Text";

        if(B.equals(true)){                                 // B == true
            System.out.println("The boolean is true");
        }
        /*
        // 1. Autoboxing - Converting primitive data types into objects
        int i = 5;
        Integer val1 = new Integer(i);      // A constructor
        Integer val2 = Integer.valueOf(i);  // Using this method saves memory
        System.out.println(val2);

        // 2. Unboxing - Converting the wrapper class to a primitive data type, using the same "val2" object
        int j;
        j = val2.intValue();
        System.out.println(j);
        System.out.println(j+4);
         */
        // 3. Example - Check if 2 Integer variables are even or odd number (math operations )with Autoboxing and Unboxing

        Integer intNr1 = 7;     // Autoboxing - Assigning a primitive value to an Integer object
        System.out.println(intNr1 + " is " + checkNr(intNr1)); // Unboxing - The compiler will internally convert the object to a primitive

        Integer intNr2 = 10;    // Autoboxing - Assigning a primitive value to an Integer object
        System.out.println(intNr2 + " is " + checkNr(intNr2)); // Unboxing - The compiler will internally convert the object to a primitive

    }

    public static String checkNr(int input){
        if(input%2==0)
            return "even";
        else
            return "odd";
    }

}
