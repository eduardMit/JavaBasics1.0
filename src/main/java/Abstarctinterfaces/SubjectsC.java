package Abstarctinterfaces;

public abstract class SubjectsC {

    //Abstract methods

    public abstract void courseContent ();

    public abstract void codeCompiler ();

    //Non-abstract methods

    public void courseDuration(int hours) {
        System.out.println("the course lasts " + hours + "hours");
    }

}
