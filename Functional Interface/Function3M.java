import java.util.ArrayList;
import java.util.function.Predicate;

public class Function3M {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("level");
        words.add("java");
        words.add("madam");
        words.add("computer");
        words.add("civic");
        words.add("apple");
        words.add("rotor");
        words.add("world");
        words.add("radar");
        words.add("spring");

        Predicate<String> isPalindrome = word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            return reversed.equalsIgnoreCase(word);
        };

        ArrayList<String> palindromes = new ArrayList<>();
        for (String word : words) {
            if (isPalindrome.test(word)) {
                palindromes.add(word);
            }
        }

        System.out.println("Palindrome words: " + palindromes);
    }
}
