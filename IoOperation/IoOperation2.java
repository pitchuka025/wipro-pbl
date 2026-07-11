import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IoOperation2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFileName = scanner.nextLine();

        System.out.println("Enter the output file name");
        String outputFileName = scanner.nextLine();

        File inputFile = new File(inputFileName);
        if (!inputFile.exists()) {
            System.out.println("Input file not found.");
            return;
        }

        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFileName)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
        }

        System.out.println("File is copied.");
        scanner.close();
    }
}
