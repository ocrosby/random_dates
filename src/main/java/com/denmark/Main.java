package main.java.com.denmark;

/* Name: Jordyn Crosby
   Date: 9/16/2022
   Period: 3
   Description: Lab accompanying 3.1 - Random dates
   Topics covered: declaring & initializing variables, random number generation, combining strings, integer to string, if-else statements
*/
public class Main {
    static String[] monthArray = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static String[] weekdayArray = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static String convertMonth(int month){
        String value;
        value = monthArray[month];
        return value;
    }

    public static String dayOfWeek(MyDate date) {
        return (new WeekdayCalculator()).calculate(date);
    }

    public static void main(String[] args)
    {
        RandomGenerator generator = new RandomGenerator();

        //Purpose: Print out a random date from 1 CE to the end of 2022 (assume leap years don't exist) in the form 1/1/2022

        //1. Declare 3 int variables called randomYear, randomMonth, randomDay
        int randomYear;
        int randomMonth;
        int randomDay;
        String output;

        //2. Initialize randomYear between 1 to 2022, inclusive & randomMonth between 1 to 12, inclusive
        randomYear = generator.generateRandomYear();

        //3. Use an if else statement to assign the random number of days in the month to randomDay depending on the month (some months have 28, 30, or 31 days) //Remember that January, March, May, July, August, October, & December have 31 days. Every other month has 30 days with the exception of February (assume it has 28 days even on LEAP years)
        randomMonth = generator.generateRandomMonth();

        //4. Print the values into the form: "The random date is: 01/01/2022". Reminder that integers must be converted into strings to prevent errors
        randomDay = generator.generateRandomDay(randomMonth, randomYear);

        System.out.print("The random date is: ");
        output = String.format("%d/%d/%d", randomMonth, randomDay, randomYear);
        System.out.println(output);

        //5. For an extra challenge convert the numerical date into a date like: January 1, 2022. The only thing needed is to convert int randomNumber to the string monthString. (Hint: Use an if else statement)
        MyDate date = new MyDate(randomYear, randomMonth, randomDay);

        System.out.print("The random date (string version) is: ");
        System.out.println(date);


        //6. For an extra, extra challenge implement and call the "dayOfWeek" method below to calculate the day of the week for your random date (example: 1/1/2021 is a Friday).
        // 9/17/22: How is this possible? Why are you making me do this? What did we do to deserve such pain and strife?
        System.out.println(Main.dayOfWeek(date));

        //7. Print the string out similar to the form:
        //    "The random date in words is: Friday, January 1, 2021"
        String weekday = Main.dayOfWeek(date);
        output = String.format("The random date in words is: %s, %s", weekday, date.toString());

        System.out.println(output);
    }
}