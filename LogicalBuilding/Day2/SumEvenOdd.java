import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        if (NumberUtils.isEven(sum)) {
            System.out.println("Sum is Even");
        } else {
            System.out.println("Sum is Odd");
        }

        sc.close();
    }
}