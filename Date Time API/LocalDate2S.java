import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDate2S {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMonthSecondSunday = today.with(TemporalAdjusters.firstDayOfNextMonth())
                .with(TemporalAdjusters.next(DayOfWeek.SUNDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

        System.out.println("Date of next month second Sunday: " + nextMonthSecondSunday);
    }
}
