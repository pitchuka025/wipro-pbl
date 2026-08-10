import java.time.LocalDate;

public class Date1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);

        System.out.println("Today: " + today);
        System.out.println("Date after 10 days: " + afterTenDays);
    }
}
