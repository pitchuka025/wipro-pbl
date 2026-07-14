import java.util.ArrayList;
import java.util.function.Supplier;

public class Consumer8M {
    public static void main(String[] args) {
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int count = 0;
            int num = 2;

            while (count < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                    count++;
                }
                num++;
            }

            return primes;
        };

        ArrayList<Integer> firstTenPrimes = primeSupplier.get();
        System.out.println("First 10 prime numbers: " + firstTenPrimes);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
