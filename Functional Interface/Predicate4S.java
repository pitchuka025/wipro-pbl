import java.util.ArrayList;
import java.util.function.Predicate;

class EmployeeData {
    private int id;
    private String name;
    private double salary;

    public EmployeeData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Predicate4S {
    public static void main(String[] args) {
        ArrayList<EmployeeData> employees = new ArrayList<>();
        employees.add(new EmployeeData(1, "Rahul", 8000));
        employees.add(new EmployeeData(2, "Asha", 12000));
        employees.add(new EmployeeData(3, "Neha", 9500));
        employees.add(new EmployeeData(4, "Vikram", 14000));
        employees.add(new EmployeeData(5, "Meera", 7000));

        Predicate<EmployeeData> salaryLessThan10000 = e -> e.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");
        for (EmployeeData e : employees) {
            if (salaryLessThan10000.test(e)) {
                System.out.println(e.getName());
            }
        }
    }
}
