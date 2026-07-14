import java.util.Scanner;

public class IsExactMultiple {

    public static int isExactMultiple(int n, int m) {
        if (m == 0)
            return 1; // Invalid case
        
        if (n % m == 0)
            return 2; // Yes, N is an exact multiple of M
        else
            return 1; // No, N is not an exact multiple of M
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
