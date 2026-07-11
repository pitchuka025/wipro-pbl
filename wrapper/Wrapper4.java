class Employee implements Cloneable {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}

public class Wrapper4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("John", 101, "HR");
        Employee clone = original.clone();

        System.out.println("Before changing original:");
        System.out.println("Original -> Name: " + original.name + ", ID: " + original.id + ", Department: " + original.department);
        System.out.println("Clone    -> Name: " + clone.name + ", ID: " + clone.id + ", Department: " + clone.department);

        original.name = "Alice";
        original.id = 102;
        original.department = "IT";

        System.out.println("\nAfter changing original:");
        System.out.println("Original -> Name: " + original.name + ", ID: " + original.id + ", Department: " + original.department);
        System.out.println("Clone    -> Name: " + clone.name + ", ID: " + clone.id + ", Department: " + clone.department);

        System.out.println("\nObservation: The clone has its own copy of primitive and reference values at the time of cloning, so changing the original object does not affect the clone.");
    }
}
