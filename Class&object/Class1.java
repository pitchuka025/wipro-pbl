import java.util.Scanner;

public class Class1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.print("Enter depth: ");
        double depth = sc.nextDouble();

        Box box = new Box(width, height, depth);
        System.out.println("Box dimensions: width=" + width + ", height=" + height + ", depth=" + depth);
        System.out.println("Volume = " + box.getVolume());

        sc.close();
    }
}
