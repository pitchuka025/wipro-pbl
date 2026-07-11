import java.util.Scanner;

public class Wrapper3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 255: ");
        int number = scanner.nextInt();

        String binary = Integer.toBinaryString(number);
        String formattedBinary = String.format("%8s", binary).replace(' ', '0');

        System.out.println("Binary representation: " + formattedBinary);

        scanner.close();
    }
}
