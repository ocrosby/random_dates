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
    public static void main(String[] args)
    {
        //Purpose: Print out a random date from 1 CE to the end of 2022 (assume leap years don't exist) in the form 1/1/2022
        int randDay31 = (int)(Math.random() * 31);
        int randDay30 = (int)(Math.random() * 30);
        int randDay28 = (int)(Math.random() * 28);

        //1. Declare 3 int variables called randomYear, randomMonth, randomDay
        int randomYear;
        int randomMonth;
        int randomDay;

        //2. Initialize randomYear between 1 to 2022, inclusive & randomMonth between 1 to 12, inclusive
        randomYear = (int)(Math.random() * 2022 + 1);
        randomMonth = (int)(Math.random() * 12 + 1);

        //3. Use an if else statement to assign the random number of days in the month to randomDay depending on the month (some months have 28, 30, or 31 days) //Remember that January, March, May, July, August, October, & December have 31 days. Every other month has 30 days with the exception of February (assume it has 28 days even on LEAP years)

        if(randomMonth == 1 || randomMonth == 3 || randomMonth == 5 || randomMonth == 7 || randomMonth == 8 || randomMonth == 9 || randomMonth == 10 || randomMonth == 12)
        {
            randomDay = (int)(Math.random() * 31);
        }
        else if(randomMonth == 4 || randomMonth == 6 || randomMonth == 11)
        {
            randomDay = (int)(Math.random() * 30);
        }
        else
        {
            randomDay = (int)(Math.random() * 28);
        }


        //4. Print the values into the form: "The random date is: 01/01/2022". Reminder that integers must be converted into strings to prevent errors
        System.out.print("The random date is: ");
        System.out.println(randomMonth + "/" + randomDay + "/" + randomYear);


        //5. For an extra challenge convert the numerical date into a date like: January 1, 2022. The only thing needed is to convert int randomNumber to the string monthString. (Hint: Use an if else statement)
        String monthString = Main.convertMonth(randomMonth);
        System.out.print("The random date (string version) is: ");
        System.out.println(monthString + " " + randomDay + ", " + randomYear);


        //6. For an extra, extra challenge implement and call the "dayOfWeek" method below to calculate the day of the week for your random date (example: 1/1/2021 is a Friday).
        // 9/17/22: How is this possible? Why are you making me do this? What did we do to deserve such pain and strife?

        //7. Print the string out similar to the form:
        //    "The random date in words is: Friday, January 1, 2021"
        System.out.print("The random date in words is: ");
        String randomYearString = (String.valueOf(randomYear)); // Converts randomYear to String
        String randYearSubstring = randomYearString.substring(randomYearString.length()-2, randomYearString.length()); //gets last two digits of year
        int lastTwoDigits = Integer.parseInt(randYearSubstring); //converts last two digits back to integer
        int weekDayFormula = ((int)Math.round(0.25 * lastTwoDigits) + lastTwoDigits) % 7; //I found this formula from a youtube video
        System.out.print(weekdayArray[weekDayFormula] + ", " + monthString + " " + randomDay + ", " + randomYear);

        System.out.println("");

    }

    public static String dayOfWeek(int m, int d, int y)
    {
    /*
    The day of the week (Sunday = 0, Monday = 1, etc.) is given by
    the following pseudocode:
      y0 = y - (14 - m)/12
      x0 = y0 + y0/4 - y0/100 + y0/400
      m0 = m + 12 * ((14-m)/12) - 2
      dow = (d + x0 + 31 * m0 / 12) mod 7
    */
        // write code below and return the day as a String


        // placeholder for compiling
        return "";
    }
}