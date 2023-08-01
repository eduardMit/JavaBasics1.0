package Collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class CollectionsUtils {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(2);
        intList.add(1);
        intList.add(1);
        intList.add(3);

        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);
        System.out.println(Collections.binarySearch(intList, 1));
        System.out.println(Collections.frequency(intList, 1));
        System.out.println(Collections.min(intList));
        System.out.println(Collections.max(intList));

        Collections.swap(intList, 1,4);
        System.out.println(intList);

        // Multiple data types
        List<Object> mixList = new ArrayList<>();
        mixList.add(12);
        mixList.add(2.5);
        mixList.add("Text");
        mixList.add('X');

        System.out.println(mixList);
        System.out.println(mixList.get(1));

    }

}
