public class Calculator {
    public static double powerInt(int num1, int num2) {
        return Math.pow((double) num1, (double) num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, (double) num2);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter integer base: ");
        int a = sc.nextInt();
        System.out.print("Enter integer exponent: ");
        int b = sc.nextInt();
        System.out.println(a + "^" + b + " = " + powerInt(a, b));

        System.out.print("Enter double base: ");
        double c = sc.nextDouble();
        System.out.print("Enter integer exponent for double base: ");
        double d = sc.nextInt();
        System.out.println(c + "^" + d + " = " + powerDouble(c, d));

        sc.close();
    }
}
