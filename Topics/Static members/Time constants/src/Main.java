class TimeConstantsDemo {

    public static void main(String[] args) {
        // print SECONDS_IN_DAY
        // print SECONDS_IN_WEEK
    }
}

final class TimeConstants {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;

    private TimeConstants() {
         final int SECONDS_IN_DAY = 60 * SECONDS_IN_HOUR;
         final int SECONDS_IN_WEEK = 60 * SECONDS_IN_DAY;

    }
}