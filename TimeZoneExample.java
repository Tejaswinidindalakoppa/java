import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExample {
    public static void main(String[] args) {
        ZonedDateTime timeInZone = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in Asia/Kolkata: " + timeInZone);
    }
}
