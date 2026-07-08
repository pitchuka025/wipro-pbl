import java.util.LinkedHashSet;
import java.util.Set;

public class Array7 {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 12, 45, 67, 89};
        Set<Integer> unique = new LinkedHashSet<>();

        for (int num : numbers) {
            unique.add(num);
        }

        System.out.print("{");
        int count = 0;
        for (Integer num : unique) {
            System.out.print(num);
            count++;
            if (count < unique.size()) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}
