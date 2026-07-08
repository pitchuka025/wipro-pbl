public class Assume {
    public static String repeatLastN(String s, int n) {
        if (s == null) return "";
        if (n <= 0) return "";
        if (n > s.length()) n = s.length();

        String last = s.substring(s.length() - n);
        StringBuilder sb = new StringBuilder(last.length() * n);
        for (int i = 0; i < n; i++) sb.append(last);
        return sb.toString();
    }

    public static void main(String[] args) {
        String input;
        int n;

        if (args.length >= 2) {
            input = args[0];
            try {
                n = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + args[1]);
                return;
            }
        } else {
            System.out.println("Enter input as string,n (e.g. Wipro,3):");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String line = sc.nextLine();
            sc.close();
            String[] parts = line.split(",", 2);
            if (parts.length < 2) {
                System.out.println("Invalid input. Provide string and n separated by a comma.");
                return;
            }
            input = parts[0];
            try {
                n = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + parts[1]);
                return;
            }
        }

        System.out.println(repeatLastN(input, n));
    }
}
