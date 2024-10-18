import java.time.LocalDate;

public class LeapYearCheck1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);
        boolean isLeapYear = date.isLeapYear();
        System.out.println("Is 2024 a leap year? " + isLeapYear);
    }
}

