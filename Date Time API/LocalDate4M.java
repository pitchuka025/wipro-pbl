import java.time.Year;

public class LocalDate4M {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        boolean leapYear = Year.isLeap(currentYear);

        System.out.println("Current year: " + currentYear);
        System.out.println("Is leap year? " + leapYear);
    }
}
