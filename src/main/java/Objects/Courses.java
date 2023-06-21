package Objects;

public class Courses {

    // Where we define a new class
    String subject;
    String level;
    int durationHR;

    public static void main(String[] args) {

        Courses Java1 = new Courses();
        Java1.subject = "Java";
        Java1.level = "Basics";

        Courses Python1 = new Courses();
        Python1.level = "Advanced";

        System.out.println("We are learning " + Java1.subject + " and the level is " + Python1.level);

    }

}
