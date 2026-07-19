import java.util.Scanner;

public class IsEven {

    public static int isEven(int num) {
        return NumberUtils.isEven(num) ? 2 : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Output: " + isEven(num));

        sc.close();
    }
}
