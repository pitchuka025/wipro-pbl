import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BoxMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Box> set = new LinkedHashSet<>();

        System.out.println("Enter the number of Box");
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double length = Double.parseDouble(sc.nextLine().trim());

            System.out.println("Enter Width");
            double width = Double.parseDouble(sc.nextLine().trim());

            System.out.println("Enter Height");
            double height = Double.parseDouble(sc.nextLine().trim());

            set.add(new Box(length, width, height));
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box b : set) {
            System.out.println(b);
        }

        sc.close();
    }
}
