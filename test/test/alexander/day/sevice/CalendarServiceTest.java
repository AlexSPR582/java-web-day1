package test.alexander.day.sevice;

import static org.testng.Assert.fail;
import static org.testng.Assert.assertEquals;

import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.service.CalendarService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalendarServiceTest {
    CalendarService service;

    @BeforeClass
    public void setUp() {
        service = new CalendarService();
    }

    @Test
    public void testCalculateDays() {
        try {
            int actual = service.calculateDays(2, 2020);
            int expected = 29;
            assertEquals(actual, expected);

        } catch (IncorrectInputException e) {
            fail();
        }
    }
}
