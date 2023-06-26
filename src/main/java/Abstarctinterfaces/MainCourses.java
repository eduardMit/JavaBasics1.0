package Abstarctinterfaces;

public class MainCourses {

    public static void main(String[] args) {

        //SubjectsC sub1 = new JavaC();
        //SubjectsC sub2 = new PythonC();

        SubjectsI sub1 = new JavaI();
        SubjectsI sub2 = new PythonI();

        sub1.courseContent();
        sub1.codeCompiler();
        sub1.courseDuration(24);
        sub1.courseDuration2(24);

        System.out.println();

        sub2.courseContent();
        sub2.codeCompiler();
        sub2.courseDuration(48);
        sub2.courseDuration2(48);


    }
}
