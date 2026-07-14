interface DigitCountFunc {
    int count(int n);
}

class DigitCountExample {
    public static int digitCount(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

public class Method2 {
    public static void main(String[] args) {
        DigitCountFunc func = DigitCountExample::digitCount;

        int result = func.count(12345);
        System.out.println("Number of digits in 12345 is: " + result);
    }
}
