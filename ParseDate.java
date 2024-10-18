import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDate {
    public static void main(String[] args) {
        String dateString = "18-10-2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed Date: " + parsedDate);
    }
}
