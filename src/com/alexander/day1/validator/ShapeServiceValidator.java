package com.alexander.day1.validator;

public class ShapeServiceValidator {
    private final int minShapeArea = 0;

    public boolean shapeValidate(double shapeArea) {
        if (shapeArea >= minShapeArea) {
            return true;
        } else {
            return false;
        }
    }
}
