import java.util.Scanner;

public class NonRepeatedDigitsCount {
    public static int countNonRepeatedDigits(int n) {
        return NumberUtils.countNonRepeatedDigits(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Non-repeated digits count: " + countNonRepeatedDigits(n));
        scanner.close();
    }
}
