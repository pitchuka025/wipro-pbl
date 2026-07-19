import java.util.Scanner;

public class AddLastDigits {

    public static int addLastDigits(int input1, int input2) {
        return NumberUtils.addLastDigits(input1, input2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int input1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int input2 = sc.nextInt();

        System.out.println("Sum of Last Digits = " + addLastDigits(input1, input2));

        sc.close();
    }
}
