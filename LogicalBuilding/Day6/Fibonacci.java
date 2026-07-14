import java.util.Scanner;

public class Fibonacci {
    public static int nthFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th Fibonacci number is " + nthFibonacci(n));
        scanner.close();
    }
}
