import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}

public class EmployeeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Employees");
        int n = 0;
        try {
            n = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception ex) {
            System.out.println("Invalid number. Exiting.");
            sc.close();
            return;
        }

        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String first = sc.nextLine().trim();

            System.out.println("Enter the Lastname");
            String last = sc.nextLine().trim();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine().trim();

            System.out.println("Enter the Email");
            String email = sc.nextLine().trim();

            System.out.println("Enter the Address");
            String address = sc.nextLine().trim();

            list.add(new Employee(first, last, mobile, email, address));
        }

        // Sort by first name (case-insensitive)
        Collections.sort(list, Comparator.comparing(Employee::getFirstName, String.CASE_INSENSITIVE_ORDER));

        System.out.println();
        System.out.println("Employee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "SecondName", "MobileNumber", "Email", "Address");

        for (Employee e : list) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                    e.getFirstName(), e.getLastName(), e.getMobile(), e.getEmail(), e.getAddress());
        }

        sc.close();
    }
}
