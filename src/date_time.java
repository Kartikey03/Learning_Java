import java.time.LocalDate;
import java.time.LocalDateTime;
public class date_time {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("2024-04-15");  // Parse from a String
        LocalDate today = LocalDate.now();

        if (today.equals(date1)) {
            LocalDateTime currentTime = LocalDateTime.now();

            LocalDateTime start = date1.atTime(3, 59, 59);
            System.out.println(start);

            if (start.isBefore(currentTime)){
                System.out.println("Check in");
                System.out.println("Upcoming: Welcome Speech (10:00 A.M)");

            }
        }
    }
}