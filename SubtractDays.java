import java.time.LocalDate;

public class SubtractDays {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.minusDays(5);
        System.out.println("Date after subtracting 5 days: " + newDate);
    }
}
