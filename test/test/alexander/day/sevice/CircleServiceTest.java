package test.alexander.day.sevice;

import com.alexander.day1.exception.IncorrectInputException;
import com.alexander.day1.service.CircleService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleServiceTest {
    CircleService service = new CircleService();

    @Test
    public void calculateCirclePerimeterTest() {
        try {
            double actualPerimeter = service.calculateCirclePerimeter(5);
            double expected = 31.4;
            Assert.assertEquals(actualPerimeter, expected, 0.001, "fail test...");
        } catch (IncorrectInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testCalculateCircleArea() {
        try {
            double actualArea = service.calculateCircleArea(5);
            double expectedArea = 78.53;
            Assert.assertEquals(actualArea, expectedArea, 0.01, "fail test...");
        } catch (IncorrectInputException e) {
            System.out.println(e);
        }
    }
}
