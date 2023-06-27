package Encapsulation;

public class TestThis {

    int I;
    public TestThis(int I){
     this.I = I;
    }

    public static void main(String[] args) {

        TestThis intVal = new TestThis(72);
        System.out.println("The value of I is: " + intVal.I);
    }


}
