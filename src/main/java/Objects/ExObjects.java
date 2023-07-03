package Objects;

public class ExObjects {

    /*
    Create a "Student" class that has the following attributes:
    - First name
    - Last name
    - Year of birth
    - Phone number

    In the "ExObjects" class, create a student object
    Provide values for those attributes and print out: "Full name: first name & last name"
    Calculate his age with a method and print the result in the following format: "Age: (result of the calculation)"
    Print out the full phone number: "Phone number: 0xxxxxxxxx"
    */
        public static void main(String[] args) {

            Student student = new Student("Eduard", "Mihai", 1998, "742028758");

            // Print the full name
            System.out.println("Full name: " + student.getFullName());

            // Calculate and print the age
            System.out.println("Age: " + student.getAge());

            // Print the full phone number
            System.out.println(student.getFullPhoneNumber());
        }
    }

