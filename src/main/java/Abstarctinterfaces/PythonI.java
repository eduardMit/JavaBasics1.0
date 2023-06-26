package Abstarctinterfaces;

public class PythonI implements SubjectsI{
    @Override
    public void courseContent() {
        System.out.println("Python development");

    }

    @Override
    public void codeCompiler() {
        System.out.println("with PyCharm");
    }

    @Override
    public void courseDuration(int hours) {
        System.out.println("The course lasts " + hours + " hours");
    }
}
