import java.util.ArrayList;

public class Lambada3 {
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

        System.out.println("Strings with odd length:");
        al.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(s -> System.out.println(s));
    }
}
