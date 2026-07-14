import java.util.ArrayList;

public class Lambda2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("Python");
        al.add("C");
        al.add("C++");
        al.add("SQL");
        al.add("HTML");
        al.add("CSS");
        al.add("JavaScript");
        al.add("Spring");
        al.add("Hibernate");

        System.out.println("Original list:");
        al.forEach(s -> System.out.println(s));

        System.out.println("\nStrings in reverse order:");
        al.stream()
          .sorted((s1, s2) -> s2.compareTo(s1))
          .forEach(s -> System.out.println(s));
    }
}
