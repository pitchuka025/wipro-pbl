import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate5S {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.add(16);
        numbers.add(25);
        numbers.add(36);
        numbers.add(49);
        numbers.add(64);
        numbers.add(100);

        Predicate<Integer> isPerfectSquare = n -> n >= 0 && (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;

        ArrayList<Integer> perfectSquares = new ArrayList<>();
        for (Integer n : numbers) {
            if (isPerfectSquare.test(n)) {
                perfectSquares.add(n);
            }
        }

        System.out.println("Perfect square numbers: " + perfectSquares);
    }
}
