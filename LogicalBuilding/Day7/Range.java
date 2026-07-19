import java.util.Scanner;

public class Range {
    public static int countPrimesInRange(int start, int end) {
        return NumberUtils.countPrimesInRange(start, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        System.out.println("Number of primes between " + start + " and " + end + " is " + countPrimesInRange(start, end));
        scanner.close();
    }
}
