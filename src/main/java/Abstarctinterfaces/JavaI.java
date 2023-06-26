package Abstarctinterfaces;

public class JavaI implements SubjectsI{
    @Override
    public void courseContent() {
        System.out.println("Java Basics");
    }

    @Override
    public void codeCompiler() {
        System.out.println("with Intellij");
    }

    @Override
    public void courseDuration(int hours) {
        System.out.println("The course lasts " + hours + " hours");
    }
}
