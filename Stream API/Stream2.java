import java.util.ArrayList;
import java.util.List;

class Employee {
    private int empNo;
    private String name;
    private int age;
    private String location;

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void display() {
        System.out.println("EmpNo: " + empNo + ", Name: " + name + ", Age: " + age + ", Location: " + location);
    }
}

public class Stream2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Rahul", 25, "Pune"));
        employees.add(new Employee(102, "Asha", 30, "Mumbai"));
        employees.add(new Employee(103, "Neha", 28, "Pune"));
        employees.add(new Employee(104, "Vikram", 35, "Delhi"));
        employees.add(new Employee(105, "Meera", 27, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(e -> "Pune".equals(e.getLocation()))
                .toList();

        System.out.println("Employees from Pune:");
        for (Employee e : puneEmployees) {
            e.display();
        }
    }
}
