package Intro;

public class Array {

    public static void main(String[] args) {

        // String array:
        String[] webServices = new String[3];
        webServices[0] = "XAMPP";
        webServices[1] = "Tomcat";
        webServices[2] = "Wildfly";

        System.out.println(webServices[2]);

        // Int array:
        int[] grades = {5, 6, 8, 7, 9, 10};
        grades[1] = 13;

        System.out.println(grades[1]);

        // System.out.println(grades);

        // Multi-dimensional Array
        char[][] matrx1 = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };
        System.out.println(matrx1[2][0]);
    }

}
