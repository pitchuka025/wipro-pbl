public class Lowercase {
    public static void main(String[] args) {
        char ch = 'a'; // initialize an alphabet character here

        if (ch >= 'a' && ch <= 'z') {
            char upper = (char) (ch - 'a' + 'A');
            System.out.println(ch + "->" + upper);
        } else if (ch >= 'A' && ch <= 'Z') {
            char lower = (char) (ch - 'A' + 'a');
            System.out.println(ch + "->" + lower);
        } else {
            System.out.println("Input is not an alphabet character.");
        }
    }
}
