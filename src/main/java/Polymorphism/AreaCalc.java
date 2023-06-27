package Polymorphism;

public class AreaCalc {

    public void area(int r){

        // Overloaded method
        System.out.println("Circle area is: " + 3.14*r*r);
        System.out.println(); //Space between circle area and triangle area.
    }
        // Overloaded method
    public void area(double b, double h){

        System.out.println("Triangle area is: " + 0.5*b*h);

    }

    public static void main(String[] args) {


        AreaCalc shapes = new AreaCalc();

        shapes.area(3);
        shapes.area(8.0,1.5);

    }

}
