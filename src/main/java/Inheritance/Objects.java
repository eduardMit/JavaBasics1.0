package Objects;
/*
class Courses2 {
    String subject;
    String level;
    int durationHR;
}

*/
public class Objects {

    public static void main(String[] args) {

        // Courses2 Java1 = new Courses2(); // If using the Courses2 class
        Courses Java1 = new Courses();
        Java1.subject = "Java";
        Java1.level = "Advanced";
        Java1.durationHR = 24;

        Courses Python1 = new Courses();
        Python1.subject = "Python";
        Python1.durationHR = 46;

        System.out.println("We are learning " + Python1.subject + " after learning " + Java1.subject);
        System.out.println(Python1.durationHR);

    }

}
