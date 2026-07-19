import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        return NumberUtils.isPrime(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }

        scanner.close();
    }
}
