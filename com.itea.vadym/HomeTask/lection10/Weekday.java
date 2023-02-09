package HomeTask.lection10;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekday () {
        return switch (this) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
            default -> true;
        };
    }
    boolean isHoliday () {
        return switch (this) {
            case SATURDAY, SUNDAY -> true;
            default -> false;
        };
    }
}
