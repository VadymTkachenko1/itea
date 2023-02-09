package HomeTask.lection10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Weekday[] array = Weekday.values();
        System.out.println(Arrays.toString(array));
        dayCheck(array);
    }

    private static void dayCheck (Weekday[] array) {
        for (Weekday weekday: array) {
            if (weekday.isWeekday()) {
                System.out.println(weekday + " is a holiday");
            } else {
                System.out.println(weekday + " is a weekday");
            }
        }
    }
}
