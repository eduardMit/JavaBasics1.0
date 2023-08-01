package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainList {
    public static void main(String[] args) {
        // 1. ArrayList

        // 1.1 String ArrayList
        ArrayList<String> arrList1 = new ArrayList<>(); // no need to define the size
        // Add an element
        arrList1.add("E1");
        arrList1.add("E2");
        arrList1.add("E3");

        System.out.println(arrList1);
        // Remove an element
        arrList1.remove("E2");
        System.out.println(arrList1);
        arrList1.add("E2");
        System.out.println(arrList1);

        // Check for a specific element
        if (arrList1.contains("E3")) {
            System.out.println("Contains E3");
        } else {
            System.out.println("Doesn't contain E3");
        }

        // Check if the ArrayList is empty
        //arrList1.clear();                 // Empty the ArrayList
        if(arrList1.isEmpty()){
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
        // Size of an ArrayList
        int size = arrList1.size();
        System.out.println(size);


        // 1.2 Integer ArrayList with Wrapper Class
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add( Integer.valueOf(1));
        intList.add( Integer.valueOf(2));
        intList.add( Integer.valueOf(3));
        intList.add( Integer.valueOf(4));

        int i = 5;
        Integer val = Integer.valueOf(i);

        intList.add(val);

        for (Integer e : intList)
            System.out.println( e + " ");

        intList.forEach(e -> System.out.println(e));    // Lambda expression


        // 2. LinkedList - Alternative to an ArrayList
        LinkedList<String> lnkList1 = new LinkedList<>();
        lnkList1.add("E1");
        lnkList1.add("E2");
        lnkList1.add("E3");

        System.out.println(lnkList1);

        lnkList1.add(1,"E4");
        System.out.println(lnkList1);

        lnkList1.remove("E3");
        System.out.println(lnkList1.get(2));

    }
}
