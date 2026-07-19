import java.util.Scanner;

public class CountEvenOrOdd {

    public static int countEven(int num1, int num2, int num3, int num4, int num5) {
        int count = 0;

        if (NumberUtils.isEven(num1))
            count++;
        if (NumberUtils.isEven(num2))
            count++;
        if (NumberUtils.isEven(num3))
            count++;
        if (NumberUtils.isEven(num4))
            count++;
        if (NumberUtils.isEven(num5))
            count++;

        return count;
    }

    public static int countOdd(int num1, int num2, int num3, int num4, int num5) {
        int count = 0;

        if (NumberUtils.isOdd(num1))
            count++;
        if (NumberUtils.isOdd(num2))
            count++;
        if (NumberUtils.isOdd(num3))
            count++;
        if (NumberUtils.isOdd(num4))
            count++;
        if (NumberUtils.isOdd(num5))
            count++;

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();

        System.out.print("Enter number 4: ");
        int num4 = sc.nextInt();

        System.out.print("Enter number 5: ");
        int num5 = sc.nextInt();

        int even = countEven(num1, num2, num3, num4, num5);
        int odd = countOdd(num1, num2, num3, num4, num5);

        System.out.println("Count of Even Numbers: " + even);
        System.out.println("Count of Odd Numbers: " + odd);
        System.out.println("Total: " + (even + odd));

        sc.close();
    }
}
