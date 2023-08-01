package Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class MainMap {

    public static void main(String[] args) {
        // HashMap
        HashMap<Integer, String> StudentIDs = new HashMap<>();

        StudentIDs.put(1, "Alex S");
        StudentIDs.put(2, "Mary J");
        StudentIDs.put(3, "Cris G");
        //StudentIDs.put(1, "Cris G");      // Overwrite the existing value of key 1
        StudentIDs.put(null, "Cris X");     // Value with a null key

        System.out.println(StudentIDs.entrySet());
        System.out.println(StudentIDs.keySet());
        System.out.println(StudentIDs.values());

        StudentIDs.remove(2);
        System.out.println(StudentIDs);

        String studentName = StudentIDs.get(3);
        System.out.println(studentName);

        // TreeMap (String and Integer pair)
        TreeMap<String, Integer> keysMap = new TreeMap<>();
        keysMap.put("K1", 30);
        keysMap.put("K3", 20);
        keysMap.put("K2", 10);
        System.out.println(keysMap);

        // TreeMap (Integer and String pair)
        TreeMap<Integer, String> keysMap2 = new TreeMap<>();
        keysMap2.put(30,"K1");
        keysMap2.put(20,"K3");
        keysMap2.put(10,"K2");
        System.out.println(keysMap2);

    }

}
