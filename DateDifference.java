import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 10, 1);
        LocalDate endDate = LocalDate.of(2024, 10, 18);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days between: " + daysBetween);
    }
}
