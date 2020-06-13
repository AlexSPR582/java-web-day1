package com.alexander.day1.validator;

public class ShapeServiceValidator {
    public boolean shapeValidate(double shapeArea) {
        if (shapeArea >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
