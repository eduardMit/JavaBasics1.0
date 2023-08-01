package Generics;

public class GenClass1<T> {

    T v1;

    GenClass1(T v1){
        this.v1 = v1;
    }

    public T getVal(){
        return v1;
    }

}
