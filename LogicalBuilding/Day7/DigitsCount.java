import java.util.Scanner;

public class DigitsCount {
    public static int countDigits(int n) {
        int count = 0;
        int number = Math.abs(n);
        do {
            number /= 10;
            count++;
        } while (number != 0);
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Total digits: " + countDigits(n));
        scanner.close();
    }
}
