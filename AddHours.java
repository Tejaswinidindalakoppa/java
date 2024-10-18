import java.time.LocalTime;

public class AddHours {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.plusHours(4);
        System.out.println("Time after adding 4 hours: " + newTime);
    }
}

