public class TomCat {
    public static String firstHalf(String s) {
        if (s == null) return null;
        if (s.length() % 2 != 0) return null;
        return s.substring(0, s.length() / 2);
    }

    public static void main(String[] args) {
        String input;
        if (args.length > 0) {
            input = args[0];
        } else {
            System.out.println("Enter a string:");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            input = sc.nextLine();
            sc.close();
        }

        String result = firstHalf(input);
        System.out.println(result);
    }
}

