package Generics;

public class ExPrinter <T>{

    T forPrinting;

    public ExPrinter(T forPrinting){
        this.forPrinting = forPrinting;
    }

    public void print() {
        System.out.println(forPrinting);
    }

}
