import java.util.Scanner;

public class UniqueDigitsCount {
    public static int countUniqueDigits(int n) {
        return NumberUtils.countUniqueDigits(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Unique digits count: " + countUniqueDigits(n));
        scanner.close();
    }
}
