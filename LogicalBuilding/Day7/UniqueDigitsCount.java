import java.util.Scanner;

public class UniqueDigitsCount {
    public static int countUniqueDigits(int n) {
        String s = Integer.toString(Math.abs(n));
        boolean[] seen = new boolean[10];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (!seen[digit]) {
                seen[digit] = true;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Unique digits count: " + countUniqueDigits(n));
        scanner.close();
    }
}
