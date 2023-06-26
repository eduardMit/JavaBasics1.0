package package2;

import package1.P1Class1;

public class SubP1Class1 extends P1Class1 {

    public static void main(String[] args) {

        P2Class1 C1 = new P2Class1();
        System.out.println(C1.defVar);

        SubP1Class1 C4 = new SubP1Class1();
        System.out.println(C4.proVar);

    }


}
