import java.util.Scanner;

public class DigitsCount {
    public static int countDigits(int n) {
        return NumberUtils.countDigits(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Total digits: " + countDigits(n));
        scanner.close();
    }
}
