import java.time.LocalDate;
import java.time.LocalTime;
public class date{
    public static void main(String[] args) {
        String m1 = "kuch nahi";
        LocalDate today = LocalDate.now();
        LocalDate date1 = LocalDate.parse("2024-04-06");  // Parse from a String
        LocalDate date2 = LocalDate.parse("2024-04-07");    // parse from a string

        if (today.equals(date1)){
            LocalTime currentTime = LocalTime.now();
            LocalTime Morning = LocalTime.of(8, 0);
            LocalTime morning = LocalTime.of(11, 0);

            LocalTime Afternoon = LocalTime.of(11, 1);
            LocalTime afternoon = LocalTime.of(15, 0);

            LocalTime Night = LocalTime.of(21, 0);
            LocalTime night = LocalTime.of(22, 0);


            if (currentTime.isAfter(Morning) & (currentTime.isBefore(morning))) {
                m1 = "Meal1";
            }
            else if (currentTime.isAfter(Afternoon)& (currentTime.isBefore(afternoon))) {
                m1 = "Meal2";
            }
            else if (currentTime.isAfter(Night)& (currentTime.isBefore(night))){
                m1 = "Meal3";
            }
        }

        else if (today.equals(date2)){
            LocalTime currentTime = LocalTime.now();
            LocalTime Morning = LocalTime.of(8, 0);
            LocalTime morning = LocalTime.of(12, 0);

            LocalTime Afternoon = LocalTime.of(14, 0);
            LocalTime afternoon = LocalTime.of(15, 0);


            if (currentTime.isAfter(Morning) & (currentTime.isBefore(morning))) {
                m1 = "Meal4";
            }
            else if (currentTime.isAfter(Afternoon)& (currentTime.isBefore(afternoon))) {
                m1 = "Meal5";
            }
        }
        System.out.println(today);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(today);
        System.out.println(m1);
    }
}