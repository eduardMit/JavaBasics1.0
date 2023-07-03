package Coolections;

import java.util.ArrayList;

public class MainList {

    //1. ArrayList

    public static void main(String[] args) {

        //1. ArrayList

        //String ArrayList
        ArrayList<String> arrList1 = new ArrayList<>(); // no need to define the size
        arrList1.add("E1");
        arrList1.add("E2");
        arrList1.add("E3");

        System.out.println(arrList1);


        // Remove an element
        arrList1.remove("E2");
        System.out.println(arrList1);


        // Check if the ArrayList is empty
        if (arrList1.contains("E3")) {
            System.out.println("Contains E3");

        } else {
            System.out.println("Dosen't exist");
        }




    }
}
