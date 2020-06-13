package test.alexander.day.sevice;

import com.alexander.day1.service.EvenNumbersService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenNumbersServiceTest {
    EvenNumbersService service = new EvenNumbersService();

    @Test
    public void testHaveTwoEvenNumbersPositive() {
        boolean actual = service.isHaveTwoEvenNumbers(4, 3, 6, 7);
        Assert.assertTrue(actual);
    }

    @Test
    public void testNotHaveTwoEvenNumbersNegative() {
        boolean actual = service.isHaveTwoEvenNumbers(1, 7, 4, 5);
        Assert.assertFalse(actual);
    }
}
