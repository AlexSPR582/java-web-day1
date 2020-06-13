package test.alexander.day.sevice;

import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.service.CalendarService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarServiceTest {
    CalendarService service;

    @BeforeClass
    public void setUp() {
        service = new CalendarService();
    }

    @Test
    public void testCalculateDaysPositive() {
        try {
            int actual = service.calculateDays(2, 2020);
            int expected = 29;
            assertEquals(actual, expected, "fail test");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test
    public void testCalculateDaysNegative() {
        try {
            int actual = service.calculateDays(2, 2019);
            int expected = 29;
            assertNotEquals(actual, expected, "fail test");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test (expectedExceptions = IncorrectInputException.class)
    public void testCalculateDaysException() throws IncorrectInputException {
        service.calculateDays(-12, 2020);
    }

    @Test
    public void isLeapTestPositive() {
        try {
            boolean actual = service.isLeapYear(2020);
            assertTrue(actual, "fail test");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test
    public void isLeapTestNegative() {
        try {
            boolean actual = service.isLeapYear(2019);
            assertFalse(actual, "fail test");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test (expectedExceptions = IncorrectInputException.class)
    public void isLeapTestException() throws IncorrectInputException {
        service.isLeapYear(-2018);
    }
}
