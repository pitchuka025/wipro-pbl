import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Predicate6S {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "java", "python", "c", "spring", "html",
                "css", "sql", "oracle", "ruby", "kotlin"
        ));

        for (int i = 0; i < words.size(); i++) {
            final int index = i;
            Consumer<String> reverseAndUpdate = word -> words.set(index, new StringBuilder(word).reverse().toString());
            reverseAndUpdate.accept(words.get(index));
        }

        System.out.println("Reversed words: " + words);
    }
}
