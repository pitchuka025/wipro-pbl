import java.util.Optional;

public class Optinal3 {

    static class InvalidEmployeeException extends Exception {
        public InvalidEmployeeException(String message) {
            super(message);
        }
    }

    static class Employee {
        private String name;
        public Employee(String name) { this.name = name; }
        @Override
        public String toString() { return "Employee{" + name + "}"; }
    }

    public static Employee validateEmployee(Employee e) throws InvalidEmployeeException {
        return Optional.ofNullable(e)
                .orElseThrow(() -> new InvalidEmployeeException("Invalid employee: null reference"));
    }

    public static void main(String[] args) {
        Employee emp = null; // try with `new Employee("John")` to see non-exception path

        try {
            Employee valid = validateEmployee(emp);
            System.out.println("Valid: " + valid);
        } catch (InvalidEmployeeException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }
    }
}
