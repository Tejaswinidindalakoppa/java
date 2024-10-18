import java.time.LocalDate;

public class DayOfWeek {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 10, 18);
        System.out.println("Day of the week: " + date.getDayOfWeek());
    }
}

