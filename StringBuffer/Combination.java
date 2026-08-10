public class Combination {
    public static String combine(String a, String b) {
        if (a == null) a = "";
        if (b == null) b = "";

        StringBuilder sb = new StringBuilder();
        int n = Math.max(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (i < a.length()) sb.append(a.charAt(i));
            if (i < b.length()) sb.append(b.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a, b;
        if (args.length >= 2) {
            a = args[0];
            b = args[1];
        } else {
            System.out.println("Enter two strings separated by a comma (e.g. Hello,World):");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String line = sc.nextLine();
            sc.close();
            String[] parts = line.split(",", 2);
            if (parts.length == 2) {
                a = parts[0];
                b = parts[1];
            } else {
                System.out.println("Invalid input. Provide two strings separated by a comma.");
                return;
            }
        }

        System.out.println(combine(a, b));
    }
}
