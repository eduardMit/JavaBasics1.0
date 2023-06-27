package Polymorphism;

public class MainCompilers {

    public static void main(String[] args) {

        Compilers compiler = new Compilers();
        IntelliJ intellij = new IntelliJ();
        PyCharm pyCharm= new PyCharm();

        /*
        System.out.println(compiler.info);
        compiler.compile();
        intellij.compile();
        System.out.println(pyCharm.info);
        pyCharm.compile();
        */
        Compilers[] compilers = {compiler, intellij,pyCharm};

        for (Compilers c : compilers){

            c.compile();
        }



    }

}
