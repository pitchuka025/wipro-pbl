public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Alice Smith", 55000.0, 2018, "AB123456C");
        System.out.println("Employee details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getAnnualSalary());
        System.out.println("Start year: " + employee.getYearStarted());
        System.out.println("NI number: " + employee.getNationalInsuranceNumber());

        employee.setAnnualSalary(60000.0);
        employee.setYearStarted(2019);
        employee.setNationalInsuranceNumber("CD987654E");
        System.out.println("Updated employee details:");
        System.out.println("Salary: " + employee.getAnnualSalary());
        System.out.println("Start year: " + employee.getYearStarted());
        System.out.println("NI number: " + employee.getNationalInsuranceNumber());
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}
