import java.io.*;
import java.util.*;

public class IoOperation3 {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: java IoOperation3 <inputFile> <outputFile>");
            return;
        }

        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        if (!inputFile.exists()) {
            System.out.println("Input file not found.");
            return;
        }

        Map<String, Integer> wordCount = new TreeMap<>();

        try (Scanner scanner = new Scanner(inputFile)) {
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
        }

        System.out.println("Word counts written to " + outputFile.getName());
    }
}
