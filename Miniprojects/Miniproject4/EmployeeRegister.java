import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<Employee> list = new TreeSet<>();

        System.out.println("Enter the Number of Employees");
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter Employee " + i + " Details");

            System.out.println("Enter the Firstname");
            String first = sc.nextLine().trim();

            System.out.println("Enter the Lastname");
            String last = sc.nextLine().trim();

            System.out.println("Enter the Mobile");
            long mobile = Long.parseLong(sc.nextLine().trim());

            System.out.println("Enter the Email");
            String email = sc.nextLine().trim();

            System.out.println("Enter the Address");
            String address = sc.nextLine().trim();

            list.add(new Employee(first, last, mobile, email, address));
        }

        System.out.println("\nEmployee List:\n");
        System.out.printf("%-15s %-15s %-15s %-30s %-15s\n",
                "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (Employee e : list) {
            System.out.printf("%-15s %-15s %-15d %-30s %-15s\n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobile(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}
