package Inheritance;

public class Inherit {

    public static void main(String[] args) {

        Module1 Agile = new Module1();
        Agile.infoModule();
        System.out.println("Presented " + Agile.location);
        System.out.println("Title: " + Agile.subject);
        System.out.println("Course duration is " + Agile.duration + " hours");
        System.out.println("Evaluation consists of " + Agile.Test);
        Agile.endCourse("09.05.2023");

        System.out.println();

        Module2 python = new Module2();
        python.infoModule();
        System.out.println("Presented " + python.location);
        System.out.println("Title: " + python.subject);
        System.out.println("Course duration is " + python.duration + " hours");
        System.out.println("Evaluation consists of " + python.Test);
        python.endCourse("23.05.2023");

        // In this case python is a new object which is different from the 1st one named Agile.
    }
}