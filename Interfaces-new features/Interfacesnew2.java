interface Test {
    int myFunction(int a, int b, int c);
}

public class Interfacesnew2 {
    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        int sumResult = t1.myFunction(2, 3, 4);
        int productResult = t2.myFunction(2, 3, 4);

        System.out.println("Sum = " + sumResult);
        System.out.println("Product = " + productResult);
    }
}
