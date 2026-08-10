interface WordCount {
    int count(String str);
}

public class Lambda4 {
    public static void main(String[] args) {
        MyClassWithLambda.main(args);
    }
}

class MyClassWithLambda {
    public static void main(String[] args) {
        WordCount wc = (str) -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            String[] words = str.trim().split("\\s+");
            return words.length;
        };

        String text = "Java lambda expression is easy";
        System.out.println("Number of words: " + wc.count(text));
    }
}
