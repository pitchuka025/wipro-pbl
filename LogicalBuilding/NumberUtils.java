/**
 * Shared numeric helpers for the LogicalBuilding exercises.
 *
 * These methods were previously duplicated across the Day3-Day7 exercise
 * classes (isPrime, isEven/isOdd, last-digit helpers, digit counting, etc.).
 * They now live in one place so each exercise can delegate to them.
 *
 * This class is in the default package so the exercise classes (also in the
 * default package) can reference it directly when compiled together, e.g.:
 *
 *   javac -d out LogicalBuilding/NumberUtils.java LogicalBuilding/Day6/Prime.java
 *   java  -cp out Prime
 */
public final class NumberUtils {

    private NumberUtils() {
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static int getLastDigit(int num) {
        return Math.abs(num % 10);
    }

    public static int getSecondLastDigit(int num) {
        num = Math.abs(num);
        if (num < 10) {
            return -1;
        }
        return (num / 10) % 10;
    }

    public static int addLastDigits(int input1, int input2) {
        return getLastDigit(input1) + getLastDigit(input2);
    }

    public static boolean isExactMultiple(int n, int m) {
        return m != 0 && n % m == 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive.");
        }
        int count = 0;
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                count++;
                if (count == n) {
                    return number;
                }
            }
            number++;
        }
    }

    public static int countPrimesInRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int nthFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public static int countDigits(int n) {
        int count = 0;
        int number = Math.abs(n);
        do {
            number /= 10;
            count++;
        } while (number != 0);
        return count;
    }

    public static int countUniqueDigits(int n) {
        String s = Integer.toString(Math.abs(n));
        boolean[] seen = new boolean[10];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (!seen[digit]) {
                seen[digit] = true;
                count++;
            }
        }
        return count;
    }

    public static int countNonRepeatedDigits(int n) {
        String s = Integer.toString(Math.abs(n));
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean repeated = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && ch == s.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                count++;
            }
        }
        return count;
    }
}
