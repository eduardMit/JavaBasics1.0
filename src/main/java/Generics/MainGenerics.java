package Generics;

public class MainGenerics {

    public static void main(String[] args) {
        // 1. Non-generic classes
        /*
        IntClass newInt1 = new IntClass(8);
        CharClass newChar1 = new CharClass('X');
        System.out.println(newInt1.getVal());
        System.out.println(newChar1.getVal());
        */
        // 2. Generic classes with one parameter
        GenClass1<Integer> newInt2 = new GenClass1<>(8);
        GenClass1<Character> newChar2 = new GenClass1<>('X');
        System.out.println(newInt2.getVal());
        System.out.println(newChar2.getVal());

        // 3. Generic class with multiple parameters
        //GenClass2<Integer, Integer> newInt3 = new GenClass2<>(3,4);
        GenClass2<Integer, Character> newInt3 = new GenClass2<>(3,'Y');
        System.out.println(newInt3.getVal1());
        System.out.println(newInt3.getVal2());

        // 4. Calculation with generics
        Numerics<Integer> calc = new Numerics<>(4);
        System.out.println(calc.square());

    }

}
