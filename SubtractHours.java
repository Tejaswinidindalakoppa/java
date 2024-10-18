import java.time.LocalTime;

public class SubtractHours {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.minusHours(3);
        System.out.println("Time after subtracting 3 hours: " + newTime);
    }
}
