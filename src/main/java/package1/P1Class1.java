package package1;

import package2.P2Class1;

public class P1Class1 {

    protected String proVar = "Protected variable"; // 3. Protected Access Specifier

    public static void main(String[] args) {

        P2Class1 C3 = new P2Class1();
        //System.out.println(C3.defVar);
        System.out.println(C3.pubVar);

        P1Class2 C2 = new P1Class2();
        //System.out.println(C2.priVar);

    }

}
