package test.alexander.day.sevice;

import static org.testng.Assert.assertEquals;

import com.alexander.day1.entity.Point;
import com.alexander.day1.service.PointService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PointServiceTest {
    PointService service;

    @BeforeClass
    public void setUp() {
        service = new PointService();
    }

    @Test
    public void testFindNearestPointPositive() {
        Point point1 = new Point(4, 5);
        Point point2 = new Point(3, 2);
        int actual = service.findNearestPoint(point1, point2);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testFindNearestPointNegative() {
        Point point1 = new Point(3, 2);
        Point point2 = new Point(4, 7);
        int actual = service.findNearestPoint(point1, point2);
        int expected = 1;
        Assert.assertNotEquals(actual, expected);
    }
}
