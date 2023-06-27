package Generics;

public class GenericMethod {

    public static void main(String[] args) {

        Integer[] intArr = {0, 1, 2, 3, 4};
        String[] stringArr = {"this", "is", "a", "string", "array"};
        Character[] charArr = {'a', 'b', 'c', 'd', 'e'};

       printElem(intArr);
       printElem(stringArr);
       printElem(charArr);
    }
/*
    public static void printElem(Integer[] array) {

        for (Integer e : array) {

            System.out.println(e + " ");

        }
        System.out.println();
    }

    public static void printElem(String[] array) {

        for (String e : array) {

            System.out.println(e + " ");


        }
        System.out.println();
    }

    public static void printElem(Character[] array) {

        for (Character e : array) {

            System.out.println(e + " ");

        }
        System.out.println();
    }
*/

 public static <T> void printElem(T[] array){

     for (T elem : array){
         System.out.println(elem + " ");
     }
     System.out.println();

 }

}