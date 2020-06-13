package test.alexander.day.sevice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import com.alexander.day1.service.LastNumeralService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LastNumeralServiceTest {
    LastNumeralService service;

    @BeforeClass
    public void setUp() {
        service = new LastNumeralService();
    }

    @Test
    public void testLastNumeralSquareNumberPositive() {
        int actual = service.calculateLastNumeralSquareNumber(12);
        int expected = 4;
        assertEquals(actual, expected, "fail test");
    }

    @Test
    public void testLastNumeralSquareNumberNegative() {
        int actual = service.calculateLastNumeralSquareNumber(12);
        int expected = 8;
        assertNotEquals(actual, expected, "fail test");
    }
}
