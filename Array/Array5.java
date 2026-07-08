import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 5, 62};

        if (numbers.length < 2) {
            System.out.println("Array must contain at least 2 elements.");
            return;
        }

        Arrays.sort(numbers);

        System.out.println("Smallest 2 numbers: " + numbers[0] + ", " + numbers[1]);
        System.out.println("Largest 2 numbers: " + numbers[numbers.length - 2] + ", " + numbers[numbers.length - 1]);
    }
}
