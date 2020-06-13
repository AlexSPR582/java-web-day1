package test.alexander.day.sevice;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import com.alexander.day1.service.EvenNumbersService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EvenNumbersServiceTest {
    EvenNumbersService service;

    @BeforeClass
    public void setUp() {
        service = new EvenNumbersService();
    }

    @Test
    public void testHaveTwoEvenNumbersPositive() {
        boolean actual = service.isHaveTwoEvenNumbers(4, 3, 6, 7);
        assertTrue(actual, "fail test");
    }

    @Test
    public void testNotHaveTwoEvenNumbersNegative() {
        boolean actual = service.isHaveTwoEvenNumbers(1, 7, 4, 5);
        assertFalse(actual, "fail test");
    }
}
