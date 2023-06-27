package Encapsulation;

public class Participants {

    public static void main(String[] args) {


    //Trainee T1 = new Trainee();
    //T1.setFullName("Eduard M");
    //T1.setID("ID001");

        Trainee T1 = new Trainee("Eduard M", "ID001");
        System.out.println(T1.getFullName());
        System.out.println(T1.getID());

        System.out.println();

        Trainee T2 = new Trainee("Mary J", "ID002");
        System.out.println(T2.getFullName());
        System.out.println(T2.getID());


    }
}
