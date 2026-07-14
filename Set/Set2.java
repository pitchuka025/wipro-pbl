import java.util.HashSet;
import java.util.Iterator;

public class Set2 {
    public static void main(String[] args) {
        HashSet<String> employeeNames = new HashSet<>();

        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");
        employeeNames.add("Alice");

        Iterator<String> iterator = employeeNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
