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

        double expected1 = -0.1425;
        double expected2 = 0.05847;
        double expected3 = 0.26435;
        double expected4 = 0.4934;
        double expected5 = 0.7735;

        assertEquals(actual1, expected1, 0.0001,"fail test");
        assertEquals(actual2, expected2, 0.0001,"fail test");
        assertEquals(actual3, expected3, 0.0001,"fail test");
        assertEquals(actual4, expected4, 0.0001,"fail test");
        assertEquals(actual5, expected5, 0.0001,"fail test");
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

        double expected1 = -0.9254;
        double expected2 = 0.9847;
        double expected3 = 0.2316;
        double expected4 = 0.6667;
        double expected5 = 0.5355;

        assertNotEquals(actual1, expected1, 0.0001, "fail test");
        assertNotEquals(actual2, expected2, 0.0001,"fail test");
        assertNotEquals(actual3, expected3, 0.0001,"fail test");
        assertNotEquals(actual4, expected4, 0.0001,"fail test");
        assertNotEquals(actual5, expected5, 0.0001,"fail test");
    }
}
