package com.alexander.day1.validator;

public class CircleServiceValidator {
    private final int minRadius = 0;

    public boolean circleValidate(double radius) {
        if (radius >= minRadius) {
            return true;
        } else {
            return false;
        }
    }
}
