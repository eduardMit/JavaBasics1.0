package Generics;

public class GenClass2<T1, T2> {

    T1 v1;
    T2 v2;

    GenClass2 (T1 v1, T2 v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    public T1 getVal1 () {
        return v1;
    }


    public T2 getVal2 (){
        return v2;
    }

}
