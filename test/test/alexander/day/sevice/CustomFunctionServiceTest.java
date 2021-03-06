package test.alexander.day.sevice;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertEquals;

import com.alexander.day1.service.CustomFunctionService;
import org.testng.annotations.Test;

public class CustomFunctionServiceTest {
    CustomFunctionService service = new CustomFunctionService();

    @Test
    public void testCalculateFunctionPositive() {
        double actual = service.calculateFunction(6);
        double expected = -9;
        assertEquals(actual, expected, 0.0001, "fail test...");
    }

    @Test
    public void testCalculateFunctionNegative() {
        double actual = service.calculateFunction(6);
        double expected = -11;
        assertNotEquals(actual, expected, 0.0001, "fail test...");
    }
}
