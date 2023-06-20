package Intro;

public class Loops {

    /* Loops:
            - For loop
            - While loops
            - Do While loops
            - For-Each loops
    */

    public static void main(String[] args) {

        //1. For Loop:

        for (int i = 0; i < 3; i ++){
            System.out.println(i);
        }

        // Example with Break:

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

        // 2. While Loop:
        int wl = 0;

        while (wl < 5) {
            System.out.println("The value of wl is 0");
            wl++;
            //System.out.println(wl);
        }
        //System.out.println(wl);

        // Example using Continue:
        int i1 = 0;

        while ( i1 < 5 ){
            i1++;

            if (i1 == 3) {
                continue;
            }
            System.out.println(i1);
        }

    // 3. For Each loop:
        String [] progLang = {"C++", "Java", "Python"};
            // System.out.println(progLang);
        for (String progr : progLang) {
            System.out.println(progr);
        }

    // 4. Do While:
    int wl1 = 6;

    do {
        System.out.println("The value of wl1 is 0");
        wl1++;
    } while (wl1 < 5);

    // 5. Print a Matrix

        char[][] matrx1 = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };

        for (int i = 0; i < 3; i++) {
            System.out.println(matrx1[i][i]);
        }

        for (int i =0; i <3; i++) {
            System.out.println("value of i " + i);
            for (int j = 0; j <3; j++){
                System.out.println("value of j " + j);
                System.out.println(matrx1[i][j]);
            }
        }
    }
}

