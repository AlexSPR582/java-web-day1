package test.alexander.day.sevice;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.alexander.day1.service.PerfectNumberService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PerfectNumberServiceTest {
    PerfectNumberService service;

    @BeforeClass
    public void setUp() {
        service = new PerfectNumberService();
    }

    @Test
    public void testIsPerfectNumberPositive() {
        boolean actual = service.isPerfectNumber(6);
        assertTrue(actual);
    }

    @Test
    public void testIsPerfectNumberNegative() {
        boolean actual = service.isPerfectNumber(8);
        assertFalse(actual);
    }
}
