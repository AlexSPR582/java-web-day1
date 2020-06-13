package test.alexander.day.sevice;

import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.service.CircleService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class CircleServiceTest {
    CircleService service;

    @BeforeClass
    public void serUp() {
        service = new CircleService();
    }

    @Test
    public void circlePerimeterTestPositive() {
        try {
            double actualPerimeter = service.calculateCirclePerimeter(5);
            double expected = 31.4;
            Assert.assertEquals(actualPerimeter, expected, 0.0001, "fail test...");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test
    public void circlePerimeterTestNegative() {
        try {
            double actualPerimeter = service.calculateCirclePerimeter(5);
            double expected = 25;
            Assert.assertNotEquals(actualPerimeter, expected, 0.0001, "fail test...");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test (expectedExceptions = IncorrectInputException.class)
    public void circlePerimeterTestException() throws IncorrectInputException {
        service.calculateCirclePerimeter(-6);
    }

    @Test
    public void testCalculateCircleAreaPositive() {
        try {
            double actualArea = service.calculateCircleArea(5);
            double expectedArea = 78.53;
            Assert.assertEquals(actualArea, expectedArea, 0.0001, "fail test...");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test
    public void testCalculateCircleAreaNegative() {
        try {
            double actualArea = service.calculateCircleArea(5);
            double expectedArea = 80;
            Assert.assertNotEquals(actualArea, expectedArea, 0.0001, "fail test...");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test (expectedExceptions = IncorrectInputException.class)
    public void testCalculateCircleAreaException() throws IncorrectInputException {
        service.calculateCircleArea(-6);
    }
}
