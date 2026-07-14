import java.util.Scanner;

public class NthPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive.");
        }

        int count = 0;
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                count++;
                if (count == n) {
                    return number;
                }
            }
            number++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th prime number is " + nthPrime(n));
        scanner.close();
    }
}
