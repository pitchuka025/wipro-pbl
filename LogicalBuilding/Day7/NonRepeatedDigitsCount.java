import java.util.Scanner;

public class NonRepeatedDigitsCount {
    public static int countNonRepeatedDigits(int n) {
        String s = Integer.toString(Math.abs(n));
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean repeated = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && ch == s.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Non-repeated digits count: " + countNonRepeatedDigits(n));
        scanner.close();
    }
}
