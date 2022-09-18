package main.java.com.denmark;

public class WeekdayCalculator {
    private int calculateMonth(int month) {
        int value = month - 2;

        if (value == -1) {
            // Handle January
            return 11;
        }

        if (value == 0) {
            // Handle February
            return 12;
        }

        return value;
    }

    /**
     * Calculate century
     * @param year
     * @return
     */
    public int calculateCentury(int year) {
        String buffer = String.valueOf(year);
        int len = buffer.length();
        String temp = buffer.substring(len-4, len-2);
        return Integer.parseInt(temp);
    }

    /**
     * Calculate the two digit year.
     * @param year
     * @return
     */
    public int calculateTwoDigitYear(int year, int month) {
        String buffer = String.valueOf(year);
        String suffix = buffer.substring(buffer.length() - 2);
        int result = Integer.parseInt(suffix);

        if ((month == 1) || (month == 2)) {
            // Handle January and February.
            result -= 1;
        }

        return result;
    }

    public String translateWeekdayValue(int value) {
        return switch (value) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Saturday";
        };
    }

    /**
     * @param year
     * @param month
     * @param day
     * @return
     */
    public String calculate(int year, int month, int day) {
        int accumulator;
        int m = this.calculateMonth(month);
        int C = this.calculateCentury(year);
        int Y = this.calculateTwoDigitYear(year, month);

        accumulator = day;
        accumulator += (int)Math.floor(2.6 * m - 0.2);
        accumulator -= 2 * C;
        accumulator += Y;
        accumulator += (int)Math.floor(Y / 4.0);
        accumulator += (int)Math.floor(C / 4.0);

        return this.translateWeekdayValue(accumulator % 7);
    }
}
