import java.util.Scanner;

public class CountOdd {

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

        System.out.println("Count of Odd Numbers: " + countOdd(num1, num2, num3, num4, num5));

        sc.close();
    }
}
