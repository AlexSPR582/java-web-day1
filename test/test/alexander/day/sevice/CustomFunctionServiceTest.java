package test.alexander.day.sevice;

import com.alexander.day1.service.CustomFunctionService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomFunctionServiceTest {
    CustomFunctionService service = new CustomFunctionService();

    @Test
    public void testCalculateFunctionPositive() {
        double actual = service.calculateFunction(6);
        double expected = -9;
        Assert.assertEquals(actual, expected, 0.001, "fail test...");
    }

    @Test
    public void testCalculateFunctionNegative() {

    }
}
