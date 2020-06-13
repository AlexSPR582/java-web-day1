package com.alexander.day1.validator;

public class CircleServiceValidator {
    public boolean circleValidate(double radius) {
        if (radius >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
