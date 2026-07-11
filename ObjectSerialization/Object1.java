import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Object1 {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("John", new Date(1000000000000L), "IT", "Developer", 75000.50);

            FileOutputStream fileOut = new FileOutputStream("data.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();

            System.out.println("Employee object serialized to data.ser");

            FileInputStream fileIn = new FileInputStream("data.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee deserializedEmployee = (Employee) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Name: " + deserializedEmployee.getName());
            System.out.println("Date of Birth: " + deserializedEmployee.getDateOfBirth());
            System.out.println("Department: " + deserializedEmployee.getDepartment());
            System.out.println("Designation: " + deserializedEmployee.getDesignation());
            System.out.println("Salary: " + deserializedEmployee.getSalary());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
