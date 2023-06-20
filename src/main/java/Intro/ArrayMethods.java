package Intro;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] grades = {5, 6, 8, 7, 9, 10, 11};
        int[] grades1 = {5, 6, 8, 7, 9, 10, 12};

        String [] progLang = {"C++", "Java", "Python"};

        String[] webServices = new String[3];
        webServices[0] = "XAMPP";
        webServices[1] = "Tomcat";
        webServices[2] = "Wildfly";

        // Array Methods:
        // 1. Fill a new array
        int [] arr = new int[4];
        Arrays.fill(arr, 55);

        for(int i : arr){
            System.out.println(i + " ");
        }

        // 2. Copy from an existing array into a new array
        int [] newGrades = Arrays.copyOf(grades, grades.length);

        for(int i : newGrades){
            System.out.println(i + " ");
        }

        // 3. (Equals) Test if 2 arrays are equal
        System.out.println(Arrays.equals(grades, grades1));

        // 4. Sort the values from an array
        Arrays.sort(grades1);

        for(int i : grades1){
            System.out.println(i + " ");
        }

        // 5. binarySearch - Returns the Index of an Element from an Array. It does not sort it, so it's better to do that first
        System.out.println(Arrays.binarySearch(grades1, 6));

        // 6. Print all elements of the array:
        for(int i =0; i<webServices.length; i++) {
            System.out.println(webServices[i]);
        }

        // 7. List

        List<String> list = Arrays.asList(webServices);
        for (String s : list) {
            System.out.println(s + " ");
        }

        // 8. ArrayList

        final ArrayList<String> bloodType = new ArrayList<>();
        bloodType.add("A");
        bloodType.add("B");
        bloodType.add("AB");
        bloodType.add("0");

        System.out.println("Blood types list: ");
        for (String bloodT : bloodType) {
            System.out.println(bloodT);
        }

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your blood type: ");
        String userType = scan1.nextLine();

        if (bloodType.contains(userType)){
            System.out.println("Selected blood type is: " + userType);
        }

    }

}
