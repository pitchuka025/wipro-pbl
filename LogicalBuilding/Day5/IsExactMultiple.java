import java.util.Scanner;

public class IsExactMultiple {

    public static int isExactMultiple(int n, int m) {
        return NumberUtils.isExactMultiple(n, m) ? 2 : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter M: ");
        int m = sc.nextInt();

        System.out.println("Output: " + isExactMultiple(n, m));

        sc.close();
    }
}
