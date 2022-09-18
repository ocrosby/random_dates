package main.java.com.denmark;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(new RandomGenerator());
    }

    public MyDate(RandomGenerator generator) {
        int year = generator.generateRandomYear();
        int month = generator.generateRandomMonth();
        int day = generator.generateRandomDay(this.month, this.year);

        this.initialize(year, month, day);
    }

    public MyDate(int year, int month, int day) {
        this.initialize(year, month, day);
    }

    private void initialize(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public String toString() {
        String monthString = MyDate.getMonthString(this.month);

        return String.format("%s %d, %d", monthString, this.day, this.year);
    }

    public static String getMonthString(int month) {
        if (month == 1) return "January";
        else if (month == 2) return "February";
        else if (month == 3) return "March";
        else if (month == 4) return "April";
        else if (month == 5) return "May";
        else if (month == 6) return "June";
        else if (month == 7) return "July";
        else if (month == 8) return "August";
        else if (month == 9) return "September";
        else if (month == 10) return "October";
        else if (month == 11) return "November";
        else if (month == 12) return "December";
        else throw new Error("Invalid Month!");
    }
}
