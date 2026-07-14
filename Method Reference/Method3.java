interface PrimeChecker {
    PrimeNumber check(int n);
}

class PrimeNumber {
    PrimeNumber(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
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

public class Method3 {
    public static void main(String[] args) {
        PrimeChecker checker = PrimeNumber::new;
        checker.check(17);
        checker.check(20);
    }
}
