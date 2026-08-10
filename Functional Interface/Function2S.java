import java.util.ArrayList;
import java.util.function.Function;

public class Function2S {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        Function<ArrayList<Integer>, Integer> sumFunction = list ->
                list.stream().mapToInt(Integer::intValue).sum();

        int sum = sumFunction.apply(numbers);
        System.out.println("Sum of all elements: " + sum);
    }
}
