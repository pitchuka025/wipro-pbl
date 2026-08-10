import java.util.LinkedList;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void GetEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeDB {
    LinkedList<Employee> list;

    EmployeeDB() {
        list = new LinkedList<>();
    }

    boolean addEmployee(Employee e) {
        if (e == null) {
            return false;
        }

        for (Employee employee : list) {
            if (employee.empId == e.empId) {
                return false;
            }
        }

        list.add(e);
        return true;
    }

    boolean deleteEmployee(int empId) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).empId == empId) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId) {
        for (Employee employee : list) {
            if (employee.empId == empId) {
                return "Pay Slip for " + employee.empName + "\nEmployee ID: " + employee.empId + "\nSalary: " + employee.salary;
            }
        }
        return "Employee not found";
    }
}

public class List5 {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Alice", "alice@example.com", "Female", 45000f);
        Employee e2 = new Employee(102, "Bob", "bob@example.com", "Male", 50000f);
        Employee e3 = new Employee(103, "Charlie", "charlie@example.com", "Male", 47000f);

        System.out.println("Add Employee 101: " + db.addEmployee(e1));
        System.out.println("Add Employee 102: " + db.addEmployee(e2));
        System.out.println("Add Employee 103: " + db.addEmployee(e3));

        System.out.println("\nEmployee Details:");
        for (Employee employee : db.list) {
            employee.GetEmployeeDetails();
            System.out.println();
        }

        System.out.println("Delete Employee 102: " + db.deleteEmployee(102));

        System.out.println("\nPay Slip for Employee 101:");
        System.out.println(db.showPaySlip(101));

        System.out.println("\nRemaining Employees:");
        for (Employee employee : db.list) {
            employee.GetEmployeeDetails();
            System.out.println();
        }
    }
}
