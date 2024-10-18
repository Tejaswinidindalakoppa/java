import java.time.LocalDate;

public class AddDays {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.plusDays(10);
        System.out.println("Date after adding 10 days: " + newDate);
    }
}
