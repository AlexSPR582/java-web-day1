package com.alexander.day1.service;

import com.alexander.day1.entity.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointService {
    public int findNearestPoint(Point p1, Point p2) {
        if (countDistance(p1) < countDistance(p2)) {
            return -1;
        } else if (countDistance(p1) > countDistance(p2)) {
            return 1;
        } else {
            return 0;
        }
    }

    private double countDistance(Point point) {
        double distance = sqrt(pow(point.getX(), 2) + pow(point.getY(), 2));
        return distance;
    }
}
