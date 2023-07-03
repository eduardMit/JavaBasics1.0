package Objects;

import java.time.LocalDate;
import java.time.Period;

    public class Student {
        private String firstName;
        private String lastName;
        private int yearOfBirth;
        private String phoneNumber;

        public Student(String firstName, String lastName, int yearOfBirth, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.yearOfBirth = yearOfBirth;
            this.phoneNumber = phoneNumber;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public int getAge() {
            int currentYear = LocalDate.now().getYear();
            return currentYear - yearOfBirth;
        }

        public String getFullPhoneNumber() {
            return "Phone number: 0" + phoneNumber;
        }
    }
