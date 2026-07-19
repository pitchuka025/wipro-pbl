import java.util.Scanner;

public class LastDigit {

    public static int getLastDigit(int num) {
        return NumberUtils.getLastDigit(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Last Digit = " + getLastDigit(num));

        sc.close();
    }
}
