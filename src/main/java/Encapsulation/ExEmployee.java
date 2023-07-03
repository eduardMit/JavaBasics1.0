package Encapsulation;

public class ExEmployee {

    // Create Employee ID and Salary in the Encapsulations.ExEmployee class
    // Using Encapsulation, give values to Employee ID and Salary in a different class, then print those new values

        private int employeeId;
        private double salary;

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

class Execute {

    public class Main {
        public static void main(String[] args) {
            // Create an instance of ExEmployee
            ExEmployee employee = new ExEmployee();

            // Set employee ID and salary using the setter methods
            employee.setEmployeeId(12345);
            employee.setSalary(50000.0);

            // Print the values using the getter methods
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Salary: $" + employee.getSalary());
        }
    }

}
