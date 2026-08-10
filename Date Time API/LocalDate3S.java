import java.time.LocalDate;
import java.time.Period;

public class LocalDate3S {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2021, 6, 15);
        LocalDate today = LocalDate.now();

        Period period = Period.between(joiningDate, today);

        System.out.println("Experience in Wipro:");
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
