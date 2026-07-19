import java.util.Scanner;

public class Factorial {
    public static long factorial(int n) {
        return NumberUtils.factorial(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        scanner.close();
    }
}
