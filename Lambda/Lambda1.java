import java.util.ArrayList;
import java.util.Random;

public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            al.add(random.nextInt(100) + 1);
        }

        System.out.println("Random numbers: " + al);
        System.out.println("Prime numbers:");

        al.stream()
          .filter(n -> isPrime(n))
          .forEach(n -> System.out.println(n));
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
