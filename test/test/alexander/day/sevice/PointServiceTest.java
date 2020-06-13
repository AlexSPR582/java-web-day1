package test.alexander.day.sevice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import com.alexander.day1.entity.Point;
import com.alexander.day1.service.PointService;
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
        assertEquals(actual, expected, "fail test");
    }

    @Test
    public void testFindNearestPointNegative() {
        Point point1 = new Point(3, 2);
        Point point2 = new Point(4, 7);
        int actual = service.findNearestPoint(point1, point2);
        int expected = 1;
        assertNotEquals(actual, expected, "fail test");
    }
}
