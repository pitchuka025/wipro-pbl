import java.util.Scanner;

public class Fibonacci {
    public static int nthFibonacci(int n) {
        return NumberUtils.nthFibonacci(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th Fibonacci number is " + nthFibonacci(n));
        scanner.close();
    }
}
