import java.util.Scanner;

public class SecondLastDigit {

    public static int getSecondLastDigit(int num) {
        return NumberUtils.getSecondLastDigit(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Second Last Digit = " + getSecondLastDigit(num));

        sc.close();
    }
}
