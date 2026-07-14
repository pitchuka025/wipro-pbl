interface FactorialFunc {
    int calculate(int n);
}

class FactorialExample {
    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Method1 {
    public static void main(String[] args) {
        FactorialExample obj = new FactorialExample();

        FactorialFunc func = obj::factorial;

        int result = func.calculate(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
