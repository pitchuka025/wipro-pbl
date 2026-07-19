import java.util.Scanner;

public class IsOdd {

    public static int isOdd(int num) {
        return NumberUtils.isOdd(num) ? 2 : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Output: " + isOdd(num));

        sc.close();
    }
}
