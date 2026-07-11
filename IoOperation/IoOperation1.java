import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IoOperation1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = scanner.nextLine();

        System.out.println("Enter the character to be counted");
        char target = scanner.nextLine().charAt(0);

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
            return;
        }

        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (Character.toLowerCase(ch) == Character.toLowerCase(target)) {
                        count++;
                    }
                }
            }
        }

        System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + target + "'.");
        scanner.close();
    }
}
