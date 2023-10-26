import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void testLeapYearDivisibleBy4ButNotBy100() {
        assertTrue(LeapYear.isLeapYear(2004));
        assertTrue(LeapYear.isLeapYear(2012));
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2100));
    }

    @Test
    public void testLeapYearDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2400));
    }

    @Test
    public void testNotLeapYearNotDivisibleBy4() {
        assertFalse(LeapYear.isLeapYear(1901));
        assertFalse(LeapYear.isLeapYear(2101));
    }

    @Test
    public void testNotLeapYearDivisibleBy4And100ButNotBy400() {
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
    }
}

