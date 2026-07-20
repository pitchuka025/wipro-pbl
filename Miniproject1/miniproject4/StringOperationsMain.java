import java.util.ArrayList;
import java.util.Scanner;

public class StringOperationsMain {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        StringBuilder r1 = new StringBuilder(s1);
        int index = 0;
        for (int i = 0; i < r1.length() && index < s2.length(); i += 2) {
            r1.replace(i, i + 1, String.valueOf(s2.charAt(index)));
            index++;
            if (index == s2.length()) {
                index = 0;
            }
        }
        list.add(r1.toString());

        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String r2 = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            list.add(r2);
        } else {
            list.add(s1 + s2);
        }

        if (first != last) {
            list.add(s1.replaceFirst(s2, ""));
        } else {
            list.add(s1);
        }

        int mid = (s2.length() + 1) / 2;
        String r4 = s2.substring(0, mid) + s1 + s2.substring(mid);
        list.add(r4);

        StringBuilder r5 = new StringBuilder(s1);
        for (int i = 0; i < r5.length(); i++) {
            if (s2.indexOf(r5.charAt(i)) != -1) {
                r5.setCharAt(i, '*');
            }
        }
        list.add(r5.toString());

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1");
        String s1 = sc.nextLine().trim();

        System.out.println("Enter String 2");
        String s2 = sc.nextLine().trim();

        ArrayList<String> result = performOperations(s1, s2);
        System.out.println(result);

        sc.close();
    }
}
