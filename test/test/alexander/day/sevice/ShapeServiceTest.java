package test.alexander.day.sevice;

import static org.testng.Assert.fail;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.service.ShapeService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShapeServiceTest {
    ShapeService service;

    @BeforeClass
    public void setUp() {
        service = new ShapeService();
    }

    @Test
    public void testCInscribedSquareAreaPositive() {
        try {
            double actualArea = service.calculateInscribedSquareArea(10);
            double expectedArea = 5;
            assertEquals(actualArea, expectedArea, 0.001, "fail test");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test
    public void testInscribedSquareAreaNegative() {
        try {
            double actualArea = service.calculateInscribedSquareArea(10);
            double expectedArea = 6;
            assertNotEquals(actualArea, expectedArea, "fail test");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test (expectedExceptions = IncorrectInputException.class)
    public void testInscribedSquareAreaException() throws IncorrectInputException {
        service.calculateInscribedSquareArea(-45);
    }

    @Test
    public void testCalculateDifferencePositive() {
        try {
            double actual = service.calculateDifference(40);
            double expected = 2;
            assertEquals(actual, expected, 0.01, "fail test");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test
    public void Negative() {
        try {
            double actual = service.calculateDifference(40);
            double expected = 3;
            assertNotEquals(actual, expected, 0.01, "fail test");
        } catch (IncorrectInputException e) {
            fail("exception occurred");
        }
    }

    @Test (expectedExceptions = IncorrectInputException.class)
    public void testCalculateDifferenceException() throws IncorrectInputException {
        service.calculateDifference(-7);
    }
}
