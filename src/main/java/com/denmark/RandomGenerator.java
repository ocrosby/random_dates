package main.java.com.denmark;

import java.util.Random;

public class RandomGenerator {
    private final Random rand;

    public RandomGenerator() {
        this.rand = new Random();
    }

    /**
     * Generate a random year from 0 to 9999.
     * @return a random year
     */
    public int generateRandomYear() {
        return this.rand.nextInt(0, 10000);
    }

    /**
     * Generate a random month from 1 to 12.
     * @return a random month
     */
    public int generateRandomMonth() {
        return this.rand.nextInt(12) + 1;
    }

    /**
     * Determine if the specified year is a leap year.
     *
     * @param year the year
     * @return true if the specified year is a leap year false otherwise
     */
    public boolean isLeapYear(int year) {
        return year % 4 == 0;
    }

    /**
     * Generates a random day of the month.
     *
     * @param month the month from 1 to 12
     * @param year the year from 0 to 9999
     * @return an integer random day of the month
     */
    public int generateRandomDay(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 9, 10, 12 ->
                // Handle months with 31 days
                this.rand.nextInt(31) + 1;
            case 4, 6, 11 ->
                // Handle months with 30 days
                this.rand.nextInt(30) + 1;
            default ->
                // Handle February
                this.rand.nextInt(this.isLeapYear(year) ? 29 : 28);
        };
    }
}
