import java.time.LocalDate;

public class AddMonths {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.plusMonths(2);
        System.out.println("Date after adding 2 months: " + newDate);
    }
}
