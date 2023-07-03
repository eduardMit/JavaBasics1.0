package Generics;

public class Numerics <T extends Number>{

    T val;

    Numerics (T val) {
        this.val = val;
    }

    double square () {

        return val.intValue() * val.doubleValue();
    }

}
