package Hackerrank;

import java.util.Calendar;

public class hackerrank7 {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // month is 0-based in Calendar
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Mapping day of week index to corresponding day string
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        return days[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 2015;
        System.out.println(findDay(month, day, year)); // Output: WEDNESDAY
    }
}
