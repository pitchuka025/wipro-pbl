import java.util.Scanner;

public class NthPrime {
    public static int nthPrime(int n) {
        return NumberUtils.nthPrime(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th prime number is " + nthPrime(n));
        scanner.close();
    }
}
