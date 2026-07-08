import java.util.Arrays;

public class Aray6 {
    public static void main(String[] args) {
        int[] numbers = {42, 7, 25, 89, 16, 3};

        Arrays.sort(numbers);

        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
