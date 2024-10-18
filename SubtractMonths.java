import java.time.LocalDate;

public class SubtractMonths {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.minusMonths(3);
        System.out.println("Date after subtracting 3 months: " + newDate);
    }
}
