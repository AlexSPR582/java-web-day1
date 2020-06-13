package test.alexander.day.sevice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import com.alexander.day1.service.FunctionRangeService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

public class FunctionRangeServiceTest {
    FunctionRangeService service;

    @BeforeClass
    public void setUp() {
        service = new FunctionRangeService();
    }

    @Test
    public void testCalculateFunctionRangePositive() {
        double left = 3;
        double right = 4;
        double step = 0.2;
        HashMap<Double, Double> actualMap = service.calculateFunctionRange(
                left, right, step);

        double actual1 = actualMap.get(3.0);
        double actual2 = actualMap.get(3.2);
        double actual3 = actualMap.get(3.4000000000000004);
        double actual4 = actualMap.get(3.6000000000000005);
        double actual5 = actualMap.get(3.8000000000000007);

        double expected1 = -0.1425465430742778;
        double expected2 = 0.058473854459578645;
        double expected3 = 0.26431690086742565;
        double expected4 = 0.4934667299849044;
        double expected5 = 0.7735560905031272;

        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
        assertEquals(actual3, expected3);
        assertEquals(actual4, expected4);
        assertEquals(actual5, expected5);
    }

    @Test
    public void testCalculateFunctionRangeNegative() {
        double left = 3;
        double right = 4;
        double step = 0.2;
        HashMap<Double, Double> actualMap = service.calculateFunctionRange(
                left, right, step);

        double actual1 = actualMap.get(3.0);
        double actual2 = actualMap.get(3.2);
        double actual3 = actualMap.get(3.4000000000000004);
        double actual4 = actualMap.get(3.6000000000000005);
        double actual5 = actualMap.get(3.8000000000000007);

        double expected1 = -0.925465430742778;
        double expected2 = 0.98473854459578645;
        double expected3 = 0.231690086742565;
        double expected4 = 0.6667299849044;
        double expected5 = 0.535560905031272;

        assertNotEquals(actual1, expected1);
        assertNotEquals(actual2, expected2);
        assertNotEquals(actual3, expected3);
        assertNotEquals(actual4, expected4);
        assertNotEquals(actual5, expected5);
    }
}
