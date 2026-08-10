import java.util.ArrayList;

public class List4 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);        // int
        numbers.add(12.5f);     // float
        numbers.add(20.75);     // double
        numbers.add(100L);      // long

        for (Number number : numbers) {
            System.out.println(number);
        }
    }
}
