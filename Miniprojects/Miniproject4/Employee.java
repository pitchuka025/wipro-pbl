public class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private long mobile;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, long mobile,
                    String email, String address) {
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

    public long getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Employee other) {
        int cmp = this.firstName.compareToIgnoreCase(other.firstName);
        if (cmp != 0) {
            return cmp;
        }
        return this.lastName.compareToIgnoreCase(other.lastName);
    }
}
