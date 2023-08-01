package Generics;

public class ExGenercis {

    // Using Generics, create a new class that can print out any data type
    // Using the new class, print out a string, an integer and a double value, in the ExGenerics class

    public static void main(String[] args) {

        ExPrinter<String> print1 = new ExPrinter<>("Text");
        ExPrinter<Integer> print2 = new ExPrinter<>(13);
        ExPrinter<Double> print3 = new ExPrinter<>(2.5);

        print1.print();
        print2.print();
        print3.print();

    }

}
