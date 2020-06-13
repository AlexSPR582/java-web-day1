package test.alexander.day.sevice;

import com.alexander.day1.entity.CustomTime;
import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.service.CustomTimeService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomTimeServiceTest {
    CustomTimeService service;

    @BeforeClass
    public void setUp() {
        service = new CustomTimeService();
    }

    @Test
    public void testCalculateTimePositive() {
        try {
            CustomTime actualTime = service.calculateTime(5678);
            CustomTime expectedTime = new CustomTime(1, 34, 38);
            assertEquals(actualTime, expectedTime);
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test
    public void testCalculateTimeNegative() {
        try {
            CustomTime actualTime = service.calculateTime(5678);
            CustomTime expectedTime = new CustomTime(2, 36, 39);
            assertNotEquals(actualTime, expectedTime);
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test (expectedExceptions = IncorrectInputException.class)
    public void testCalculateTimeException() throws IncorrectInputException {
        service.calculateTime(-12);
    }
}
