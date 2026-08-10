import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer7M {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        Consumer<Integer> printOddEven = n -> System.out.println(n + (n % 2 == 0 ? " even" : " odd"));
        numbers.forEach(printOddEven);
    }
}
