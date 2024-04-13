import java.time.LocalTime; // import the LocalTime class
public class time {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.now();
        LocalTime endTime = LocalTime.of(23, 59);
        String m1 = "meal1";
        if (startTime.isBefore(endTime)) {
            m1 = "meal2";
            System.out.println(m1);
            System.out.println("Start time is before end time");
        } else if (startTime.isAfter(endTime)) {
            System.out.println("Start time is after end time");
        } else {
            System.out.println("Start time is equal to end time");
        }
    }
}
