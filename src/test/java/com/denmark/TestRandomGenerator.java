package test.java.com.denmark;

import org.junit.Before;
import org.junit.Test;

import main.java.com.denmark.RandomGenerator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestRandomGenerator {
    private RandomGenerator generator;

    @Before
    public void setUp() {
        this.generator = new RandomGenerator();
    }

    @Test
    public void testIsLeapYearWith2000() {
        assertTrue(this.generator.isLeapYear(2000));
    }

    @Test
    public void testIsLeapYearWith2001() {
        assertFalse(this.generator.isLeapYear(2001));
    }

    @Test
    public void testIsLeapYearWith2002() {
        assertFalse(this.generator.isLeapYear(2002));
    }

    @Test
    public void testIsLeapYearWith2003() {
        assertFalse(this.generator.isLeapYear(2003));
    }

    @Test
    public void testIsLeapYearWith2004() {
        assertTrue(this.generator.isLeapYear(2004));
    }

}
