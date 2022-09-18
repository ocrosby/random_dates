package test.java.com.denmark;

import org.junit.Before;
import org.junit.Test;

import main.java.com.denmark.WeekdayCalculator;

import static org.junit.Assert.assertEquals;

/**
 * For more test values see the following URL.
 * https://www.calculator.net/day-of-the-week-calculator.html
 *
 * For details on the formula used see the following URL.
 * https://cs.uwaterloo.ca/~alopez-o/math-faq/node73.html
 */
public class TestWeekdayCalculator {
    private WeekdayCalculator calculator;

    @Before
    public void setUp() {
        this.calculator = new WeekdayCalculator();
    }

    @Test
    public void testCalculateCase1() {
        assertEquals("Saturday", this.calculator.calculate(2022, 9, 17));
    }

    @Test
    public void testCalculateCase2() {
        assertEquals("Thursday", this.calculator.calculate(1975, 9, 25));
    }

    // Y is year (1987 has Y = 87 except Y = 86 for Jan & Feb)
    @Test
    public void testCalculateTwoDigitYearJan1987() {
        assertEquals(86, calculator.calculateTwoDigitYear(1987, 1));
    }

    @Test
    public void testCalculateTwoDigitYearFeb1987() {
        assertEquals(86, calculator.calculateTwoDigitYear(1987, 2));
    }

    @Test
    public void testCalculateTwoDigitYearMarch1987() {
        assertEquals(87, calculator.calculateTwoDigitYear(1987, 3));
    }

    @Test
    public void testCalculateCentury1987() {
        assertEquals(19, calculator.calculateCentury(1987));
    }
}
