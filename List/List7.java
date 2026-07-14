import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employee {
    int empId;
    String empName;
    String email;

    Employee(int empId, String empName, String email) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
    }

    void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + empName + ", Email: " + email);
    }
}

public class List7 {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Alice", "alice@example.com"));
        employees.add(new Employee(102, "Bob", "bob@example.com"));
        employees.add(new Employee(103, "Charlie", "charlie@example.com"));

        System.out.println("Using Iterator:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            e.display();
        }

        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            Employee e = enumeration.nextElement();
            e.display();
        }
    }
}
