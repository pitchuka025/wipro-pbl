import java.util.ArrayList;
import java.util.function.Function;

class Employee {
    private int id;
    private String name;
    private String location;
    private double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }
}

public class Function1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Rahul", "Pune", 25000));
        employees.add(new Employee(2, "Asha", "Mumbai", 30000));
        employees.add(new Employee(3, "Neha", "Pune", 28000));
        employees.add(new Employee(4, "Vikram", "Delhi", 32000));
        employees.add(new Employee(5, "Meera", "Pune", 27000));

        Function<Employee, String> getLocation = Employee::getLocation;
        ArrayList<String> locations = new ArrayList<>();

        for (Employee e : employees) {
            locations.add(getLocation.apply(e));
        }

        System.out.println("Employee locations: " + locations);
    }
}
